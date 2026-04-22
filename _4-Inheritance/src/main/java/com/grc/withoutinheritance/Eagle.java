package com.grc.withoutinheritance;

public class Eagle {

    private String name;
    private int age;
    private String color;
    private String scientificName;
    private double wingSpan;
    private double flySpeed;

    public Eagle() {}

    public Eagle(String name, int age, String color, String scientificName,
                 double wingSpan, double flySpeed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.scientificName = scientificName;
        this.wingSpan = wingSpan;
        this.flySpeed = flySpeed;
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

    public double getWingSpan() { return wingSpan; }
    public void setWingSpan(double wingSpan) { this.wingSpan = wingSpan; }

    public double getFlySpeed() { return flySpeed; }
    public void setFlySpeed(double flySpeed) { this.flySpeed = flySpeed; }

    // Methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("Eagle screeches.");
    }

    public void fly() {
        System.out.println(name + " is flying at speed " + flySpeed);
    }

    public void hunt() {
        System.out.println(name + " is hunting.");
    }

    public void layEgg() {
        System.out.println(name + " lays eggs.");
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", scientificName='" + scientificName + '\'' +
                ", wingSpan=" + wingSpan +
                ", flySpeed=" + flySpeed +
                '}';
    }
}
