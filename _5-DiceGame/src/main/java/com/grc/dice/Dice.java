package com.grc.dice;

import java.util.Random;

public class Dice {
    // Fields or properties of a dice
    private int side;
    private int value;
    private Random random = new Random();
    private final static int[] acceptedSides = {6, 8, 10, 16, 20}; // 6, 8, 10, 16, 20
    private final static int DEFAULT_SIDE = 6;

    // Constructor
    public Dice()
    {
        this.side = DEFAULT_SIDE;
    }
    public Dice(int side)
    {
        // validate the side
        for (int s : acceptedSides)
        {
            if(side == s)
            {
                this.side = side;
                return;
            }
        }
        System.out.println("Invalid side. set to defaule side: "+ DEFAULT_SIDE);
        this.side = DEFAULT_SIDE;
    }

    // Method
    public int roll()
    {
        int rolledValue = random.nextInt(this.side)+1;
        this.value = rolledValue;
        return rolledValue;
    }
    public int roll10Times()
    {
        for (int i = 0; i < 10; i++) {
            this.value = this.value + random.nextInt(this.side)+1;
        }
        return this.value;
    }
    public int roll(int num)
    {
        for (int i = 0; i < num; i++) {
            this.value = this.value + random.nextInt(this.side)+1;
        }
        return this.value;
    }

    // Getter
    public int getSide()
    {
        return this.side;
    }
    public int getValue()
    {
        return this.getValue();
    }
    public Random getRandom()
    {
        return this.random;
    }
}
