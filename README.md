# Simple Student Enrollment System (CRUD)

## Project Description
This is a Java Swing application that implements a Simple Student Enrollment System. It connects to a MySQL database to perform Create, Read, Update, and Delete (CRUD) operations for Students, Courses, and Enrolled Subjects.

## Project Structure
* **Java Source Code:** Contains the GUI classes (`StudentFrame`, `CourseFrame`, `EnrollmentFrame`) and the database connection logic.
* **Database File:** `activity4_enrollment_db.sql` - The exported MySQL database containing the table structures and relationships.
* **ERD Diagram:** `ERD_Diagram.png` - Visual map of the database tables and their One-to-Many relationships.

## How to Set Up the MySQL Database
1. Open your MySQL management tool
2. Create a new database named `activity4_enrollment_db`.
3. Import the provided `activity4_enrollment_db.sql` file into this new database to automatically build the `Student`, `Course`, and `Enrolled Subject` tables.

## Dependencies Required
* **Java Development Kit (JDK):** Version 8 or higher.
* **MySQL Database:** To host the local server.
* **MySQL JDBC Driver:** `mysql-connector-j` (Required to connect the Java application to the MySQL database).

## How to Run the Application
1. Clone or download this repository to your local machine.
2. Open the project in your Java IDE (e.g., Apache NetBeans).
3. Ensure the MySQL JDBC Driver is added to your project's Libraries.
4. Run your local MySQL server (via XAMPP or MySQL Workbench).
5. Run the main Java file to launch the application GUI.
