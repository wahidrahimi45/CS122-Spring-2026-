package com.grc.dice;

// Always roll at least 70 % of the max side
public class LuckyDice extends ColoredDice {
    public LuckyDice(String color, int side) {
        super(color, side);
    }

    @Override
    public int roll()
    {
        int minVale = (int) (this.getSide() * 0.70);
        int value = 0;
        do{
            //value = this.getRandom().nextInt(this.getSide())+1;
            value = super.roll();
        }while (value < minVale);
        return value;
    }

}
