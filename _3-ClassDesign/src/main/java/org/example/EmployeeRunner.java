package org.example;

import org.example.management.HR;
import org.example.personnel.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        // ClassName variableName = new ClassName();
        //Employee employee1 = new Employee();

//        employee1.id = 101;
//        employee1.firstName = "Linda";
//        employee1.lastName = "Smith";
//        employee1.department ="HR";
//        employee1.salary = 200000;
//        employee1.yearsOfExperience = 4;
//        employee1.active = true;

//        employee1.setId(101);
//        employee1.setFirstName("Linda");
//        employee1.setLastName("Smith");
//        employee1.setDepartment("HR");
//        employee1.setActive(true);

        //Employee employee2 = new Employee();

//        employee2.id = 102;
//        employee2.firstName = "Bob";
//        employee2.lastName = "Smith";
//        employee2.department ="IT";
//        employee2.salary = 679000.78;
//        employee2.yearsOfExperience = 5;
//        employee2.active = false;

        //Employee employee3 = new Employee();


//
//        HR hr = new HR();
//        Employee[] employees = {employee1, employee2, employee3};
//
//        hr.reviewEmployees(employees);
//        printInfo(employee1);
//        printInfo(employee2);
//        printInfo(employee3);


//        Employee alex = new Employee();
//        alex.setId(101);
//        alex.setFirstName("Alex");
//        alex.setLastName("Smith");
//        alex.setSalary(100000);
//        alex.setActive(true);
//        alex.setYearsOfExperience(8);

//        alex.printEmployeeInformation();
//
//        System.out.println("------------------------------");
//        alex.increaseSalary(10);
//
//        alex.printEmployeeInformation();



        String name = "Wahid";
        int age = 30;

//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(alex);




    }
    public static void printInfo(Employee employee){
        System.out.println("Employee ID: "+ employee.getId());
        System.out.println("Employee First Name: "+ employee.getFirstName());
        System.out.println("Employee Last Name: "+ employee.getLastName());
        System.out.println("Salary: "+ employee.getSalary());
        System.out.println("Employee Dept: "+ employee.getDepartment());
        System.out.println("Active: "+ (employee.isActive() ? "Active" : "Not Active"));
        System.out.println();
    }

}
