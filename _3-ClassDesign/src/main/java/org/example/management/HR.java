package org.example.management;

import org.example.personnel.Employee;

public class HR {
    public void reviewEmployees(Employee[] employees)
    {
        // process
//        for (int i = 0; i < employees.length; i++) {
//            employees[i]
//        }
        for(Employee employee : employees)
        {
            //employee.salary = -10000;
            employee.setSalary(-10000);
        }
    }
}
