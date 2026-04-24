package com.grc.withinheritance;

// Dog inherits from Mammal → which inherits from Animal
public class Dog extends Mammal {

    private String breed;

    public Dog() {}

    public Dog(String name, int age, String color, String scientificName, String breed) {
        super(name, age, color, scientificName);
        this.breed = breed;
    }

    // Dog-specific behaviors
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    // Getter & Setter
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

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
