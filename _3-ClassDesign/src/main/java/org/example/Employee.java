package org.example;

public class Employee {
    // Data, Fields, Attributes, Data Member
    int id;
    String firstName;
    String lastName;
    String department;
    double salary;
    int yearsOfExperience;
    boolean active;

    // Constructor ( 1- No arg constructor (default constructor), 2- Parameterized Constructor)
    public Employee()
    {
        System.out.println("An Employee object is created");
        firstName = "Unknown";
        lastName = "Unknown";
        department = "Not Defined";
        salary = 10.5;
        yearsOfExperience = 1;
        active = true;
    }

    // Getters and Setters


    // Methods, Behavior, Functionality

    // toString() method
}
