package com.grc.dice;

// Roll 2 time and return the max value
public class WeightedDice extends Dice {
    // Constructor
    public WeightedDice()
    {
        super();
    }
    public WeightedDice(int side)
    {
        // validate the side
        super(side);
    }

    // Method
    @Override
    public int roll()
    {
        int roll1 = this.getRandom().nextInt(this.getSide())+1;
        int roll2 = this.getRandom().nextInt(this.getSide())+1;
        if(roll1 > roll2)
            return roll1;
        else
            return roll2;
    }

}
