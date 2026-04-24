package com.grc.withinheritance;

// Duck inherits from Bird
public class Duck extends Bird {

    public Duck() {}

    public Duck(String name, int age, String color, String scientificName,
                double wingSpan, double flySpeed) {
        super(name, age, color, scientificName, wingSpan, flySpeed);
    }

    public void makeSound() {
        System.out.println("Duck quacks.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    @Override
    public String toString() {
        return "Duck{" + super.toString() + "}";
    }
}