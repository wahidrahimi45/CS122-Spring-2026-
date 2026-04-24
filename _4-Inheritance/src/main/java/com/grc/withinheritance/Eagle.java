package com.grc.withinheritance;

// Eagle inherits from Bird
public class Eagle extends Bird {

    public Eagle() {}

    public Eagle(String name, int age, String color, String scientificName,
                 double wingSpan, double flySpeed) {
        super(name, age, color, scientificName, wingSpan, flySpeed);
    }

    public void makeSound() {
        System.out.println("Eagle screeches.");
    }

    public void hunt() {
        System.out.println(name + " is hunting.");
    }

    @Override
    public String toString() {
        return "Eagle{" + super.toString() + "}";
    }
}
