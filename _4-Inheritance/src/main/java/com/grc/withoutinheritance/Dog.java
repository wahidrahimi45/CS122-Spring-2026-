package com.grc.withoutinheritance;

public class Dog {

    private String name;
    private int age;
    private String color;
    private String scientificName;
    private String breed;

    // Default Constructor
    public Dog() {}

    // Parameterized Constructor
    public Dog(String name, int age, String color, String scientificName, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.scientificName = scientificName;
        this.breed = breed;
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

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    // Methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("Dog barks.");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void giveBirth() {
        System.out.println(name + " gives birth to puppies.");
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", scientificName='" + scientificName + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
