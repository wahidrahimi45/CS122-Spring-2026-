package com.grc.dice;

public class ColoredDice extends Dice{
    private String color;

    public ColoredDice(String color, int side)
    {
        super(side);
        this.color = color;
    }

    //getter
    public String getColor()
    {
        return this.color;
    }
    @Override
    public String toString()
    {
        return super.toString() +"\n"+
                "Color: "+ this.color;
    }
}
