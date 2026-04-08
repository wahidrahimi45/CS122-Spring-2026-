package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
    Employee Data Analysis Tasks:

    Count total number of employees

    Print all employee names

    Count active vs inactive employees

    Find employees older than 40

    List employees in the IT department



    Calculate average salary

    Find highest & lowest salary

    Calculate average age per department

    Count employees per department

    Find all contract employees



    Find department with highest average salary

    Find most experienced employee

    Calculate salary expense for active employees only

    Filter employees working in Seattle

    Compare Full-Time vs Part-Time salary averages

    what if the some lines have extra or missing employee information. (format missing)
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File employeeData = new File("emp-data/employee.txt");
        int employeeCounter = 0;

        if(employeeData.exists())
        {
            Scanner employeeReader = new Scanner(employeeData);

            while (employeeReader.hasNextLine())
            {

                String line = employeeReader.nextLine();
                if(line.startsWith("#") || line.isEmpty())
                {
                    continue;
                }
                // ID,Name,Department,Age,Salary,YearsExperience,EmploymentType,City,Active
                // 0   1  , 2        , 3 , 4,   ,  5            , 6,            ,7,  8
                employeeCounter++;
                String[] data = line.split(",");

                if(data[8].equals("true"))
                {
                    String empName = data[1];
                    System.out.println(empName.toUpperCase());
                }

            }


            employeeReader.close();
        }
        else {
            System.out.println("File does not exist");
        }

        System.out.println("Employee Cunt: "+ employeeCounter);
    }
}