package com.grc.withinheritance;

// Bird class inherits from Animal
public class Bird extends Animal {

    protected double wingSpan;
    protected double flySpeed;

    public Bird() {}

    public Bird(String name, int age, String color, String scientificName,
                double wingSpan, double flySpeed) {
        super(name, age, color, scientificName);
        this.wingSpan = wingSpan;
        this.flySpeed = flySpeed;
    }

    // Bird-specific behaviors
    public void fly() {
        System.out.println(name + " is flying at speed " + flySpeed);
    }

    public void layEgg() {
        System.out.println(name + " lays eggs.");
    }

    // Getters & Setters
    public double getWingSpan() { return wingSpan; }
    public void setWingSpan(double wingSpan) { this.wingSpan = wingSpan; }

    public double getFlySpeed() { return flySpeed; }
    public void setFlySpeed(double flySpeed) { this.flySpeed = flySpeed; }

    @Override
    public String toString() {
        return super.toString() +
                ", wingSpan=" + wingSpan +
                ", flySpeed=" + flySpeed;
    }
}
