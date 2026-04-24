package com.grc.withinheritance;

// Cat inherits from Mammal
public class Cat extends Mammal {

    public Cat() {}

    public Cat(String name, int age, String color, String scientificName) {
        super(name, age, color, scientificName);
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