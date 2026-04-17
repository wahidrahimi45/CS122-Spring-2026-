package org.example;

import org.example.personnel.Employee;

public class EmployeeRunner2 {
    public static void main(String[] args) {
        Employee employee1 =
                new Employee(101, "Alex", "Smith", "HR", 1000000.50,5,true);

        employee1.printEmployeeInformation();

        Employee employee2 = new Employee(102, "Erica", "Smith");
        employee2.printEmployeeInformation();

        Employee employee3 = new Employee();


    }
    // Method overloading
//    public static int add(int num1, int num2)
//    {
//        return num1 + num2;
//    }
//    public static double add(double num1, double num2)
//    {
//        return num1 + num2;
//    }
//    public static int add(int num1, int num2, int num3)
//    {
//        return num1 + num2 + num3;
//    }
}
