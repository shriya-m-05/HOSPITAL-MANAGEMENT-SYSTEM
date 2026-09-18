# PROBLEM STATEMENT

Hospitals and small clinics often rely on paper registers or scattered spreadsheets to record patient information and schedule appointments. These manual methods can result in lost or duplicate records, difficulty in quickly accessing doctor information and scheduling conflicts.

One of the major problems is the possibility of booking the same doctor for two appointments during the same date and time slot..

# SOLUTION

My project builds a simple **Java-based Hospital Management System** that provides a menu-driven interface for managing basic hospital records.
The system stores patient, doctor and appointment information using **MySQL** and connects the Java application to the database using **JDBC**.

The system allows the user to:

1. Add new patient records.
2. View registered patients.
3. View doctors stored in the database.
4. Book appointments using patient ID, doctor ID, date and time slot.
5. Check doctor availability before confirming an appointment.
6. Prevent double-booking of a doctor.
7. Exit the application through the main menu.

# SCOPE OF PROJECT

The application takes different inputs from the user depending on the selected operation.

### Patient Inputs

* Name
* Age
* Gender

### Appointment Inputs

* Patient ID
* Doctor ID
* Date
* Time Slot

The system stores and retrieves the required information from the MySQL database.

The current scope focuses on basic patient management, doctor information and appointment booking. Advanced features such as billing, authentication, graphical interface and electronic health records are outside the current implementation and can be considered for future development.

# TARGET USER

This application can be used by 
1. **Hospital staff**
2. **Small Clinics**
3. **Reception/Appointment Staff**

# HIGH-LEVEL FEATURES

My project contains several core features.

## 1. Add Patient

Creates a new patient record by taking:

* Patient name
* Age
* Gender

The patient information is stored in the MySQL database.

## 2. View Patients

Displays all registered patients stored in the database.

This allows the user to review existing patient records and obtain the required patient ID for appointment booking.

## 3. View Doctors

Displays doctors stored in the MySQL database along with their relevant information such as:

* Doctor ID
* Doctor name
* Specialization

The doctor ID can be used while booking an appointment.

## 4. Book Appointment

Creates an appointment using:

* Patient ID
* Doctor ID
* Date
* Time Slot

The system checks the selected doctor's availability before confirming the appointment.

## 5. Doctor Availability Check

Before booking an appointment, the system checks whether the selected doctor already has an appointment for the entered date and time slot.

If the slot is free, the appointment is confirmed.

If the slot is already occupied, the booking fails and the user is informed that the doctor is not available at that slot.

## 6. Menu-Driven Interface

The application provides a simple numbered menu containing:

1. Add Patient
2. View Patients
3. View Doctors
4. Book Appointment
5. Exit

The menu continues to appear after each operation until the user chooses the Exit option.

# PROJECT OBJECTIVES

The main objectives of this project are:

1. To develop a basic hospital management application using Java.
2. To store hospital records using a MySQL database.
3. To establish Java-MySQL connectivity using JDBC.
4. To manage basic patient information.
5. To display doctor information.
6. To provide a basic appointment booking facility.
7. To prevent appointment conflicts through doctor availability checking.
8. To understand the practical implementation of Java, SQL and database connectivity.

# FUTURE SCOPE

The current system can be expanded in several ways.

### Short-Term

* Graphical user interface using Swing or JavaFX.
* Appointment cancellation and rescheduling.
* Updating and deleting patient records.
* Patient search by name.

### Medium-Term

* Login system for administrators, doctors and staff.
* Billing and payment management.
* Reports and statistics.
* Email or SMS appointment reminders.

### Long-Term

* Web or mobile application using Spring Boot.
* Electronic health record management.
* Cloud deployment.
* AI-based smart scheduling.

These enhancements can extend the current console-based system into a more complete hospital management platform.

