package com.grc.withinheritance;

// Mammal class inherits from Animal
public class Mammal extends Animal {

    // Default constructor
    public Mammal() {}

    // Parameterized constructor using super
    public Mammal(String name, int age, String color, String scientificName) {
        super(name, age, color, scientificName); // call parent constructor
    }

    // Mammal-specific behavior
    public void giveBirth() {
        System.out.println(name + " gives birth to babies.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}
