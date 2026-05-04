package org.example;

public class Student {

    private String name; // instance variable (non-static variable)
    private int age; // instance variable (non-static variable)

    private static String schoolName; // Static variable: it belongs to class
    public static int counter;

    public static final int MAX_VALUE = 4;


    {
        System.out.println("Non static block");
        counter++;
    }

    static {
        System.out.println("Static block");
        schoolName = "GRC";
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Student(String name)
    {
        this.name = name;
    }
    public Student()
    {
    }

    public void displayInfo() // instance method
    {
        System.out.println(this.name +" is "+ this.age +" years old, studies at: "+ this.schoolName);
    }

    public static void printSchoolName() // static method
    {
        System.out.println(schoolName);
//        Student student = new Student("Alex", 33);
//        System.out.println(student.name);
//        System.out.println(student.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

}
