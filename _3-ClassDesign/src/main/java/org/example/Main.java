package org.example;
/*
1. Problem with the non-OOP way
	Naming problem when storing many employees, many unrelated variables
	No clear representation of an Employee, no single Employee entity
	Hard to store a collection of employees
	Searching becomes awkward and error-prone
	Repeated code everywhere
	No behavior attached to the data
	Hard to reuse
	Harder to validate data
	Hard to update the structure later
	Poor readability and poor modeling

How class and OOP solve these problems
	one clear Employee type
	all employee data grouped together
	easy creation of many employees
	easy storage in arrays or ArrayLists
	easier searching, updating, printing
	methods attached to employee data
	encapsulation and validation
	better code reuse
	cleaner and more realistic design
 */

public class Main {
    public static void main(String[] args) {
//        int id = 101;
//        String firstName = "Linda";
//        String lastName = "Smith";
//        String department = "HR";
//        double salary = 100000.00;
//        int yearsOfExperience = 3;
//        boolean active = true;
//
//        int id2 = 101;
//        String firstName2 = "Linda";
//        String lastName2 = "Smith";
//        String department2 = "HR";
//        double salary2 = 100000.00;
//        int yearsOfExperience2 = 3;
//        boolean active2 = true;

        // ClassName variableName = new ClassName();
        Employee employee1 = new Employee();

        employee1.id = 101;
        employee1.firstName = "Linda";
        employee1.lastName = "Smith";
        employee1.department ="HR";
        employee1.salary = 200000;
        employee1.yearsOfExperience = 4;
        employee1.active = true;

        Employee employee2 = new Employee();

        employee2.id = 102;
        employee2.firstName = "Bob";
        employee2.lastName = "Smith";
        employee2.department ="IT";
        employee2.salary = 679000.78;
        employee2.yearsOfExperience = 5;
        employee2.active = false;

        printInfo(employee1);
        printInfo(employee2);

        Employee employee3 = new Employee();
        printInfo(employee3);
    }
    public static void printInfo(Employee employee){
        System.out.println("Employee ID: "+ employee.id);
        System.out.println("Employee First Name: "+ employee.firstName);
        System.out.println("Employee Last Name: "+ employee.lastName);
        System.out.println("Employee Dept: "+ employee.department);
        System.out.println("Active: "+ (employee.active ? "Active" : "Not Active"));
        System.out.println();
    }
    public static void printInfo(int id, String firstName, String lastName, String dep, double salary, boolean active)
    {
        System.out.println("Id: "+ id);
        System.out.println("First Name: "+ firstName);

        if(active)
        {
            System.out.println("Active");
        }
        else {
            System.out.println("Not Active");
        }
    }
}

