package com.grc.practice3referencetype;

public class Main2 {
    public static void main(String[] args) {
        Child child = new Child(10);
    }
}

class Parent{
    String name;
//    public Parent()
//    {
//
//    }
    public Parent(String name)
    {
        this.name = name;
    }
}

class Child extends Parent{
    int age;
    public Child(int age)
    {
        super("Unknown");
        this.age = age;
    }
    public Child(int age, String name)
    {
        super(name);
        this.age = age;
    }
}