package org.example;

public class Main {
    public static void main(String[] args) {
//        Student.setSchoolName("GRC");
//        Student s1 = new Student("Bob", 21);
//        Student s2 = new Student("Alex",20);
//
//
//        s1.displayInfo();
//        s2.displayInfo();
//
//        Student.printSchoolName();
//
//        Main obj = new Main();
//        obj.add(2,4);


//        Dice dice1 = new Dice(6,"Red");
//        Dice dice2 = new Dice(20,"Yellow");
//
//        dice1.print();
//        dice2.print();
//        Student student = new Student("Alex");

        Randomizer r1 = new Randomizer();
        Randomizer r2 = new Randomizer();
        Randomizer r3 = new Randomizer();
        Randomizer r4 = new Randomizer();
        Randomizer r5 = new Randomizer();


        for (int i = 0; i < 20; i++) {
            r1.generate();
            r1.generate(2,30);

            r2.generate();
            r2.generate(2,30);

            r3.generate();
            r3.generate(2,30);

            r4.generate();
            r4.generate(2,30);

            r5.generate();
            r5.generate(2,30);
        }



        System.out.println("Even Count: "+ Randomizer.getEvenCount());
        System.out.println("Odd Count: "+ Randomizer.getOddCount());

    }

    public int add(int x, int y)
    {
        return x + y;
    }
}