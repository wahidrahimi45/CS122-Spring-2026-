package com.grc;

import com.grc.dice.Dice;
import com.grc.players.Player;


public class TwoPlayerRunner {
    public static void main(String[] args) {

        final int SIDE = 6;
        Dice dice = new Dice(SIDE);

        Player player1 = new Player("Bob", dice);
        Player player2 = new Player("Emma", dice);

        player1.roll(10);
        player2.roll(10);

        announceTheWinner(player1, player2);
    }
    public static void announceTheWinner(Player player1, Player player2)
    {
        System.out.println(player1.getName()+" got "+ player1.getScore());
        System.out.println(player2.getName()+" got "+ player2.getScore());

        if(player1.getScore() > player2.getScore())
        {
            System.out.println(player1.getName()+" is the winner");
        }
        else if (player2.getScore() > player1.getScore())
        {
            System.out.println(player2.getName()+" is the winner");
        }
        else {
            System.out.println("tied");
        }
    }
}