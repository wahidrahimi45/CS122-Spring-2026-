package com.grc.withinheritance;

/*
    Problems with not using inheritance
    name, age, color, scientificName repeated everywhere
    eat(), sleep(), printInfo() repeated
    Bird-specific (wingSpan, flySpeed) repeated
    Mammal behavior (giveBirth) repeated
 */
public class Main {
    public static void main(String[] args) {

        // ================= DOG OBJECTS =================
        Dog dog1 = new Dog("Buddy", 3, "Brown", "Canis lupus familiaris", "Labrador");
        Dog dog2 = new Dog("Max", 5, "Black", "Canis lupus familiaris", "German Shepherd");
        Dog dog3 = new Dog("Rocky", 2, "White", "Canis lupus familiaris", "Bulldog");

        Dog dog4 = dog1;

//        System.out.println(dog1 == dog4);
//        System.out.println(dog1.equals(dog4));
//        dog1.printInfo();
//        dog1.eat();
//        dog1.fetch();
//        int age = 10;
//
//        dog2.printInfo();
//        dog2.makeSound();
//        dog2.play();
//
//        dog3.printInfo();
//        dog3.sleep();
//        dog3.giveBirth();

        System.out.println("================================");

        // ================= CAT OBJECTS =================
        Cat cat1 = new Cat("Kitty", 2, "White", "Felis catus");
        Cat cat2 = new Cat("Milo", 4, "Gray", "Felis catus");
        Cat cat3 = new Cat("Luna", 1, "Black", "Felis catus");

        cat1.printInfo();
        cat1.climb();

        cat2.printInfo();
        cat2.makeSound();

        cat3.printInfo();
        //cat3.play();
        cat3.giveBirth();

        System.out.println("================================");

        // ================= EAGLE OBJECTS =================
        Eagle eagle1 = new Eagle("Sky", 5, "Brown", "Aquila chrysaetos", 2.5, 120);
        Eagle eagle2 = new Eagle("Storm", 7, "Golden", "Aquila chrysaetos", 3.0, 140);
        Eagle eagle3 = new Eagle("Blaze", 4, "Dark Brown", "Aquila chrysaetos", 2.8, 130);

        eagle1.printInfo();
        eagle1.fly();
        eagle1.hunt();

        eagle2.printInfo();
        eagle2.makeSound();

        eagle3.printInfo();
        eagle3.layEgg();

        System.out.println("================================");

        // ================= DUCK OBJECTS =================
        Duck duck1 = new Duck("Daffy", 2, "White", "Anas platyrhynchos", 1.2, 60);
        Duck duck2 = new Duck("Donald", 3, "Yellow", "Anas platyrhynchos", 1.3, 55);
        Duck duck3 = new Duck("Daisy", 1, "Brown", "Anas platyrhynchos", 1.1, 50);

        duck1.printInfo();
        duck1.swim();

        duck2.printInfo();
        duck2.fly();

        duck3.printInfo();
        duck3.layEgg();


        Dog dog = new Dog("Buddy", 3, "Brown", "Canis lupus", "Labrador");
        Cat cat = new Cat("Kitty", 2, "White", "Felis catus");
        Eagle eagle = new Eagle("Sky", 5, "Brown", "Aquila", 2.5, 120);
        Duck duck = new Duck("Daffy", 2, "White", "Anas", 1.2, 60);

        dog.printInfo();
        dog.fetch();
        dog.giveBirth(); // inherited from Mammal
        dog.eat();       // inherited from Animal

        System.out.println("--------------");

        cat.printInfo();
        cat.climb();
        cat.giveBirth();

        System.out.println("--------------");

        eagle.printInfo();
        eagle.fly();     // from Bird
        eagle.hunt();

        System.out.println("--------------");

        duck.printInfo();
        duck.swim();
        duck.fly();

    }
}
