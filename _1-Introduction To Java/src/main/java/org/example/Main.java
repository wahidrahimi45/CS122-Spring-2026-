package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args){
//        System.out.println("Hello world!");
//        int x = 10;
//        Integer y = 10;
//        System.out.println("Done");

//        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 10;

//        int[] numbers = {10,3, 20,7,55, 30,40,50, 13};
//
//        numbers[2] = 60;
//
//        for(int index = 0; index < numbers.length; index++)
//        {
//            if(numbers[index] % 2 == 1) {
//                System.out.println(numbers[index]);
//            }
//        }

//        double result = add(345, 555);
//
//        System.out.println(result);

//        int age = 20;
//
//        String name = "Alex";
//
//        char a = 'a';
//        Character b = 'b';

//        int a = 10;
//
//        int b = 20;
//
//        if(a != b)
//        {
//            System.out.println("equal");
//        }
//        else{
//            System.out.println("not equal");
//        }

        int age = 20 ;

//        age -= 10;
//
//        System.out.println(age);

        if(age > 18)
        {
            System.out.println("can vote");
        }
        else {
            System.out.println("cannot vote ");
        }

        // condition ? value1 : value2;

        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

    }
    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }
}