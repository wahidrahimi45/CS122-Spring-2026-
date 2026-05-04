package com.grc.dice;

// Roll and land on the max side
public class FixedDice extends Dice {
    // Constructor
    public FixedDice()
    {
        super();
    }
    public FixedDice(int side)
    {
        // validate the side
        super(side);
    }

    // Method
    @Override
    public int roll()
    {
        return this.getSide();
    }

}
