package com.grc.withinheritance;

// Parent class - contains common properties and behaviors for ALL animals
public class Animal {

    protected String name;
    protected int age;
    protected String color;
    protected String scientificName;

    // Default constructor
    public Animal() {}

    // Parameterized constructor
    public Animal(String name, int age, String color, String scientificName) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.scientificName = scientificName;
    }

    // Common behaviors shared by all animals
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    // Common print method
    public void printInfo() {
        System.out.println(this);
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getScientificName() { return scientificName; }
    public void setScientificName(String scientificName) { this.scientificName = scientificName; }

    // toString method
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", scientificName='" + scientificName + '\'' +
                '}';
    }
}
