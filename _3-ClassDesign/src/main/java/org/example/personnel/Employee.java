package org.example.personnel;

/*
    Constructor Chaining (Java)

    Constructor chaining means calling one constructor from another constructor in the
    same class or in the parent class to reuse initialization code.

    Instead of repeating the same initialization logic in multiple constructors, we chain them together.

    In Java this is done using:

    this() → calls another constructor in the same class
    super() → calls the parent class constructor
 */
public class Employee {
    // Data, Fields, Attributes, Data Member
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
    private int yearsOfExperience;
    private boolean active;
    private String[] departments = {"HR", "IT", "FINANCE", "MANAGEMENT"};


    // Constructor ( 1- No arg constructor (default constructor), 2- Parameterized Constructor)
//    public Employee()
//    {
//       //System.out.println("An Employee object is created");
//        firstName = "Unknown";
//        lastName = "Unknown";
//        department = "Not Defined";
//        salary = 10.5;
//        yearsOfExperience = 1;
//        active = true;
//    }

//    public Employee(int id, String firstName, String lastName, String department, double salary, int yearsOfExperience, boolean active)
//    {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.department = department;
//        this.salary = salary;
//        this.yearsOfExperience = yearsOfExperience;
//        this.active = active;
//    }
//    public Employee(int id, String firstName, String lastName)
//    {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//
//        this.department = "HR";
//        this.salary = 80000;
//        this.yearsOfExperience = 1;
//        this.active = true;
//    }


    // Constructor chaining
    // Constructor 1
    public Employee() {
        this.active = true;
    }

    // Constructor 2
    public Employee(int id, String firstName) {
        this(); // calls default constructor
        if(isValidId(id))
            this.id = id;
        if(isValidName(firstName))
            this.firstName = firstName;

    }

    // Constructor 3
    public Employee(int id, String firstName, String lastName) {
        this(id, firstName); // calls constructor 2
        if(isValidName(lastName))
            this.lastName = lastName;
    }

    // Constructor 4
    public Employee(int id, String firstName, String lastName, String department) {
        this(id, firstName, lastName); // calls constructor 3
        if(isValidDepartment(department))
            this.department = department;
    }

    // Constructor 5 (Full constructor)
    public Employee(int id, String firstName, String lastName,
                    String department, double salary,
                    int yearsOfExperience, boolean active) {

        this(id, firstName, lastName, department); // calls constructor 4
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.active = active;
    }

    // Getters and Setters
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {

        if(isValidId(id))
            this.id = id;
        else
            this.id = 1000;
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
        if(isValidName(firstName))
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
        if(isValidName(lastName))
            this.lastName = lastName;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {
        if(isValidDepartment(department))
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

    // private method for internal logic
    private boolean isValidId(int id)
    {
        if(id < 0 || id > 1000)
            return false;
        return true;
    }
    private boolean isValidName(String name)
    {
        if(name == null || name.isEmpty() || name.length() > 20)
        {
            return false;
        }else {
            return true;
        }
    }
    private boolean isValidDepartment(String department)
    {
        for (String dep : departments)
        {
            if(department.toUpperCase().equals(dep.toUpperCase()))
            {
                return true;
            }
        }
        return false;
    }
    public void printEmployeeInformation()
    {
        System.out.println("ID: " + this.id);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: "+ this.department);
        System.out.println("Year of Experience: "+ this.getYearsOfExperience());
        System.out.println("Active: "+ (this.isActive() ? "Active": "Not Active"));
        System.out.println("------------------------------------------------------");
        System.out.println();
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
