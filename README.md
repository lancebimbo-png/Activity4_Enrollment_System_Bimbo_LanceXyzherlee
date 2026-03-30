# Student Enrollment System (Java Swing CRUD)

## Overview
This is a desktop-based Student Enrollment System developed using Java Swing and MySQL. It was built as an academic laboratory activity (Activity 4) to demonstrate core Object-Oriented Programming (OOP) concepts, graphical user interface (GUI) design, and database integration. 

The application allows users to perform full CRUD (Create, Read, Update, Delete) operations across multiple database tables.

## Key Features
* **Modular GUI Design:** Separate JFrame modules for managing Courses and Enrollments.
* **Centralized Database Architecture:** Utilizes the **Singleton Design Pattern** for the database connection (`DBconnection.java`), significantly improving memory efficiency and performance by preventing redundant MySQL logins.
* **Enhanced Security:** Implements `PreparedStatement` across all SQL queries to effectively prevent SQL Injection attacks.
* **Data Transformation:** Features robust date parsing using `SimpleDateFormat`, seamlessly converting user-friendly date inputs (MM-DD-YYYY) into strict MySQL database formats (YYYY-MM-DD).
* **Dynamic Data Rendering:** Uses `DefaultTableModel` to instantly reflect database changes on the UI without requiring an application restart.

## Technologies Used
* **Language:** Java (JDK 8+)
* **GUI Framework:** Java Swing (AWT / Javax)
* **Database:** MySQL Server
* **Connectivity:** JDBC (Java Database Connectivity) Driver

## Setup and Installation

### 1. Database Configuration
1. Open your MySQL client (e.g., MySQL Workbench, XAMPP/phpMyAdmin).
2. Create a new database named `activity4_enrollment_db`.
3. Create the required tables: `course` and `enrolled subject` (ensure you have matching columns for IDs, names, descriptions, and dates).

### 2. Application Configuration
1. Clone this repository to your local machine.
2. Open the project in your preferred IDE (NetBeans, Eclipse, or IntelliJ).
3. Ensure the **MySQL JDBC Driver** (e.g., `mysql-connector-java.jar`) is added to your project's Libraries/Build Path.
4. Open the `DBconnection.java` (or respective frames) and update the database credentials to match your local MySQL setup:
   ```java
   // Example:
   "jdbc:mysql://localhost:3306/activity4_enrollment_db", "root", "YOUR_LOCAL_PASSWORD"

## ERD
<img width="621" height="299" alt="ERD_Diagram drawio" src="https://github.com/user-attachments/assets/9662a97d-9e87-40b0-8bf3-d8e048084482" />
