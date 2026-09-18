package HospitalManagementSystem;

import java.sql.*;
import java.util.Scanner;

public class HospitalManagementSystem 
{
    private static final String url = "jdbc:mysql://localhost:3306/hospital";
    private static final String username = "root";
    private static final String password = "Admin@123";

    public static void main(String args[]) 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        try
        {
            Connection c = DriverManager.getConnection(url, username, password);
            Patient p = new Patient(c, sc);
            Doctor d = new Doctor(c);
            while(true)
            {
                System.out.println("HOSPITAL MANAGEMENT SYSTEM ");
                System.out.println("1. Add Patient");
                System.out.println("2. View Patients");
                System.out.println("3. View Doctors");
                System.out.println("4. Book Appointment");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();

                switch(choice)
                {
                    // Add Patient
                    case 1:
                        p.addPatient();
                        System.out.println();
                        break;
                        
                    // View Patient
                    case 2:
                        p.viewPatients();
                        System.out.println();
                        break;

                    // View Doctors
                    case 3:
                        d.viewDoctors();
                        System.out.println();
                        break;

                    // Book Appointment
                    case 4:
                        bookAppointment(p, d, c, sc);
                        System.out.println();
                        break;
                        
                    case 5:
                        System.out.println("THANK YOU! FOR USING HOSPITAL MANAGEMENT SYSTEM!!");
                        return;
                        
                    default:
                        System.out.println("Enter valid choice!!!");
                        break;
                }

            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    public static void bookAppointment(Patient p, Doctor d, Connection c, Scanner sc)
    {
        System.out.print("Enter Patient Id: ");
        int patientId = sc.nextInt();
        System.out.print("Enter Doctor Id: ");
        int doctorId = sc.nextInt();
        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String appointmentDate = sc.next();
        if(p.getPatientById(patientId) && d.getDoctorById(doctorId))
        {
            if(checkDoctorAvailability(doctorId, appointmentDate, c))
            {
                String appointmentQuery = "INSERT INTO appointments(patient_id, doctor_id, appointment_date) VALUES(?, ?, ?)";
                try 
                {
                    PreparedStatement preparedStatement = c.prepareStatement(appointmentQuery);
                    preparedStatement.setInt(1, patientId);
                    preparedStatement.setInt(2, doctorId);
                    preparedStatement.setString(3, appointmentDate);
                    int rowsAffected = preparedStatement.executeUpdate();
                    if(rowsAffected>0)
                        System.out.println("Appointment Booked!");
                    else
                        System.out.println("Failed to Book Appointment!");
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            else
                System.out.println("Doctor not available on this date!!");
        }
        else
            System.out.println("Either d or p doesn't exist!!!");
    }

    public static boolean checkDoctorAvailability(int doctorId, String appointmentDate, Connection c)
    {
        String query = "SELECT COUNT(*) FROM appointments WHERE doctor_id = ? AND appointment_date = ?";
        try
        {
            PreparedStatement preparedStatement = c.prepareStatement(query);
            preparedStatement.setInt(1, doctorId);
            preparedStatement.setString(2, appointmentDate);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                int count = resultSet.getInt(1);
                if(count == 0)
                    return true;
                else
                    return false;
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
