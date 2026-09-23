# Student Management System

A Java-based Student Management System developed in two stages.

## Project Development

### Stage 1 – Java Collections
Initially, the project was developed using Java Collections (`ArrayList`) to store and manage student records in memory.

### Stage 2 – JDBC and MySQL
The project was later extended using JDBC and MySQL to provide persistent database storage.

## Features

- Add Student
- Display Students
- Search Student
- Update Student
- Delete Student
- Sort by ID
- Sort by Name
- Sort by Department
- Sort by Age
- Sort by Marks

## Technologies Used

- Java
- Java Collections
- JDBC
- MySQL

## Concepts Used

- Object-Oriented Programming
- Collections
- CRUD Operations
- JDBC
- SQL
- Database Connectivity

## Project Structure

```text
StudentManagementSystem
├── src
│   ├── Main.java
│   ├── model
│   │   └── Student.java
│   ├── service
│   │   └── StudentManager.java
│   └── util
│       ├── DBConnection.java
│       └── InputHelper.java
└── lib
    └── mysql-connector-j-9.7.0.jar
