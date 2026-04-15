package org.example.personnel;

public class Employee {
    // Data, Fields, Attributes, Data Member
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
    private int yearsOfExperience;
    private boolean active;


    // Constructor ( 1- No arg constructor (default constructor), 2- Parameterized Constructor)
    public Employee()
    {
       //System.out.println("An Employee object is created");
        firstName = "Unknown";
        lastName = "Unknown";
        department = "Not Defined";
        salary = 10.5;
        yearsOfExperience = 1;
        active = true;
    }

    // Getters and Setters
    public int getId()
    {
        return id;
    }
    public void setId(int newId)
    {
        if(newId < 0 || newId  > 1000)
        {
            System.out.println("Invalid ID, Please try again");
            return;
        }
        id = newId;
    }

    // private String firstName;

    // getter for the firstName
    public String getFirstName()
    {
        return firstName.toUpperCase();
    }

    // setter for the firstName
    public void setFirstName(String firstName)
    {
        // validate the firstName
        if(firstName == null || firstName.isEmpty() || firstName.length() > 16)
        {
            System.out.println("Invalid first Name");
            return;
        }
        this.firstName = firstName;
    }

    // getter for salary
    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        // validation
        if(salary < 0 || salary > 1000000)
        {
            System.out.println("Invalid salary, please enter a valid salary");
            return;
        }
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if(yearsOfExperience < 0)
        {
            System.out.println("Invalid year of experience");
            return;
        }
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Methods, Behavior, Functionality
    public String getFullName()
    {
        return this.firstName +" " + this.lastName;
    }

    public double getAnnualSalary()
    {
        return this.salary * 12;
    }

    public double calculateBonus()
    {
        if(this.yearsOfExperience >= 20)
        {
            return salary + (salary * 20 /100);
        }
        if(this.yearsOfExperience >= 5)
        {
            return salary + (salary * 0.10);
        }
        return salary + salary * 0.05;
    }
    public void deactivated()
    {
        this.active = false;
    }

    public void increaseSalary(double percentage)
    {
        if(percentage <= 0 || percentage > 25)
        {
            System.out.println("Invalid data");
            return;
        }
        this.salary =this.salary +  this.salary * percentage / 100;
    }

    public void promoteEmp(String department)
    {
        this.department = department;
        // give 10 % increase
        this.increaseSalary(10);
    }

    public void printEmployeeInformation()
    {
        System.out.println("ID: " + this.id);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: "+ this.department);

    }
    // toString() method
//    public String toString()
//    {
//        return
//                "ID: " + this.getId() +"\n"
//                        +"First Name: "+ this.getFirstName() + "\n"
//                + "Last Name: "+ this.getLastName()+ "\n"
//                ;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", yearsOfExperience=" + yearsOfExperience +
                ", active=" + active +
                '}';
    }
}
