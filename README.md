# HOSPITAL-MANAGEMENT-SYSTEM

Description -  Hospital Management System is a simple and efficient **Java-based console application** that helps hospitals and small clinics manage patient records, doctor information and appointments in one place. 
The system replaces paper-based records with a menu-driven application connected to a **MySQL database using JDBC**. It allows users to add and view patients, view doctors and book appointments while checking the availability of doctors to prevent double-booking.

## Features

My project contains 3 Java classes named:

1. **Patient**

   * Contains operations related to patient records.
   * Adds new patients with their details.
   * Displays all registered patients.
   * Retrieves a patient's ID for appointment booking.

2. **Doctor**

   * Contains operations related to doctor records.
   * Displays doctors stored in the MySQL database.
   * Retrieves a doctor's ID for appointment booking.

3. **Management**

   * Contains the main program and menu.
   * Handles user input and menu operations.
   * Books appointments.
   * Checks doctor availability before confirming an appointment.

### Project contains the following features:

1. **Add Patient**

   * Add a new patient with:

     * Name
     * Age
     * Gender

2. **View Patients**

   * View all registered patients stored in the database.

3. **View Doctors**

   * View doctors stored in the MySQL database.
   * Display doctor information such as:

     * Name
     * Specialization

4. **Book Appointment**

   * Book an appointment using:

     * Patient ID
     * Doctor ID
     * Date
     * Time slot

5. **Doctor Availability Check**

   * Checks whether the selected doctor is already booked for the given date and time slot.
   * Prevents two appointments from being booked with the same doctor at the same time.

6. **Menu-driven Interface**

   * Provides a simple numbered menu.
   * The menu continues to appear until the user selects Exit.

## Tools Used

1. **Programming Language** - Java
2. **Database** - MySQL
3. **Database Connectivity** - JDBC
4. **Development Environment** - Java development environment / IDE
5. **Version Control** - Git and GitHub

## Database

The project uses MySQL for persistent storage.

The database contains the following main tables:

* **PATIENTS**
* **DOCTORS**
* **APPOINTMENTS**

### PATIENTS

Stores patient information such as:

* ID
* Name
* Age
* Gender

### DOCTORS

Stores doctor information such as:

* ID
* Name
* Specialization

### APPOINTMENTS

Stores appointment information such as:

* ID
* Patient ID
* Doctor ID
* Date
* Time Slot

## Installation

1. Install **Java JDK** on the system.
2. Install **MySQL Server**.
3. Install an IDE suitable for Java development.
4. Install/configure **MySQL Connector/J** for JDBC connectivity.
5. Create the required MySQL database and tables.
6. Add doctor records to the database.
7. Open the project in the IDE.
8. Configure the database connection details in the Java project.
9. Compile and run the `Management` class.
10. The Hospital Management menu will be displayed in the console.

## Application Menu

The application provides the following menu:

```text
====HOSPITAL MANAGEMENT====

1. Add Patient
2. View Patients
3. View Doctors
4. Book Appointment
5. Exit
```

The user selects an option and provides the required information. After completing an operation, the program returns to the main menu until the user chooses Exit.

## Project Structure

```text
Hospital-Management-System
│
├── README.md
├── STATEMENT.md
├── patient.java
├── doctor.java
├── management.java
```

### Project Structure

```text
Management
│
├── main()
├── bookAppointment()
└── checkDoctorAvailability()

Patient
│
├── connection
├── scanner
├── addPatient()
├── viewPatients()
└── getPatientById()

Doctor
│
├── connection
├── viewDoctors()
└── getDoctorById()
```

The project follows a three-class structure where **Patient**, **Doctor**, and **Management** each have separate responsibilities.

## Instructions for Testing

1. Open and run the application.
2. Select **Add Patient**.
3. Enter:

   * Patient name
   * Age
   * Gender
4. Select **View Patients** to verify the patient record.
5. Select **View Doctors** to view doctors stored in MySQL.
6. Select **Book Appointment**.
7. Enter:

   * Patient ID
   * Doctor ID
   * Date
   * Time slot
8. If the doctor is available, the appointment should be confirmed.
9. Try booking the same doctor for the same date and time slot again.
10. The system should reject the second booking.
11. Test an invalid menu choice and verify that the program asks the user to retry.
12. Select **Exit** to close the application.
