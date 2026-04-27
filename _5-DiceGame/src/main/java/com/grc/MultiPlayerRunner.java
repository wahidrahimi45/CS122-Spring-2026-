package com.grc;

import com.grc.dice.Dice;
import com.grc.dice.FixedDice;
import com.grc.dice.WeightedDice;
import com.grc.players.Player;

public class MultiPlayerRunner {
    public static void main(String[] args) {
        final int SIDE = 16;
        Dice dice = new Dice(SIDE);
        WeightedDice weightedDice = new WeightedDice(SIDE);
        FixedDice fixedDice = new FixedDice(SIDE);

        Player player1 = new Player("Bob", dice);
        Player player2 = new Player("Alex", dice);
        Player player3 = new Player("Emma", weightedDice);
        Player player4 = new Player("Emily", dice);
        Player player5 = new Player("John", fixedDice);

        Player[] players = {player1, player2, player3, player4, player5};

        for (Player player : players)
        {
            player.roll(5);
        }

        announceTheWinner(players);
    }
    public static void announceTheWinner(Player[] players)
    {
        for (Player player : players)
        {
            System.out.println(player.getName()+ " got: "+ player.getScore());
        }
        int highestScore = 0;
        Player winner = null;

        for (Player player : players)
        {
            if(player.getScore() > highestScore)
            {
                winner = player;
                highestScore = player.getScore();
            }
        }

        System.out.println(winner.getName() +" is the winner");
    }
}
