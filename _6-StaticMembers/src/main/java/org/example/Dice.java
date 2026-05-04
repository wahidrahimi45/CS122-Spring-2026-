package org.example;

public class Dice {
    private static int side;
    private static String color;

    public Dice(int newSide, String newColor)
    {
        side = newSide;
        color = newColor;
    }

    public void print()
    {
        System.out.println("A "+ side +" sided, "+ color+" dice.");
    }
}
