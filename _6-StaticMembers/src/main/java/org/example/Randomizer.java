package org.example;

import java.util.Random;

public class Randomizer {
    private static int evenCount;
    private static int oddCount;

    private Random random = new Random();


    public int generate()
    {
        int value = random.nextInt(1, 100 + 1);
        if(value % 2 == 0)
        {
            evenCount++;
        }
        else {
            oddCount++;
        }
        return value;
    }

    public int generate(int low, int high)
    {
        int value = random.nextInt(low, high + 1);
        if(value % 2 == 0)
        {
            evenCount++;
        }
        else {
            oddCount++;
        }
        return value;
    }

    public static int getEvenCount() {
        return evenCount;
    }



    public static int getOddCount() {
        return oddCount;
    }



    public Random getRandom() {
        return random;
    }


}
