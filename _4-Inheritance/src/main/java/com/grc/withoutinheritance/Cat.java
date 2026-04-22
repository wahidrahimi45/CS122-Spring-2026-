package com.grc.withoutinheritance;

public class Cat {

    private String name;
    private int age;
    private String color;
    private String scientificName;

    public Cat() {}

    public Cat(String name, int age, String color, String scientificName) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.scientificName = scientificName;
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

    // Methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("Cat meows.");
    }

    public void climb() {
        System.out.println(name + " is climbing.");
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void giveBirth() {
        System.out.println(name + " gives birth to kittens.");
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", scientificName='" + scientificName + '\'' +
                '}';
    }
}
