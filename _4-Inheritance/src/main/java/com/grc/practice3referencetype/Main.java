package com.grc.practice3referencetype;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("Alex", 20);
//        Student s2 = new Student("Bob", 22);
//
//        s1.setName("John");
//
//        Student s3 = s1;
//
//        System.out.println(s1);
//        System.out.println(s3);

        int x = 10;


        Student s1 = new Student("Alex", 19);
        change(s1);

        System.out.println(s1);


    }
    public static void change(Student s)
    {
        s.setName("AAAA");
        s.setAge(30);
    }
}


class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public String toString()
    {
        return "Name: "+ name+"\n"+"Age: "+age+"\n";
    }
}