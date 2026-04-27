package com.grc.players;

import com.grc.dice.Dice;
public class Player {
    private String name;
    private int score;
    private Dice dice; // has-a

    //Constructor
    public Player()
    {
        this.name = "UNKNOWN";
        this.dice = new Dice(); // set to a default 6 sided dice
    }
    public Player(String name, Dice dice)
    {
        this.name = name;
        this.dice = dice;
    }
    //Method
    public int roll()
    {
        int value = this.dice.roll();
        this.score += value;
        System.out.println(this.getName()+ " rolled a dice and got value = "+ value);
        return value;
    }
    public int roll(int num)
    {
        for (int i = 0; i < num; i++) {
            int value = this.dice.roll();
            this.score += value;
            System.out.println(this.getName()+ " rolled a dice and got value = "+ value);
        }
        return score;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
