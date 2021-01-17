package com.company;

import java.util.HashMap;

public class ClearStrategy {

    public void clearStrategyCheck(HashMap<Integer,Integer> minmax,HashMap<Integer,Integer> maxmin)
    {
        if(maxmin.values().equals(minmax.values()))
        {
            System.out.println("Array has clear strategies: ");
            System.out.println("Strategy №1: " + minmax.keySet() + " for Player A");
            System.out.println("Startegy №2: " + maxmin.keySet() + " for Player B");
            System.out.println("Saddle point: " + minmax.values());

        }
        else
        {
            System.out.println("The is no clear strategies!");
            System.out.println("          Lower price of the game:                ");
            System.out.println("Strategy №1: " + minmax.keySet() + " . Value: " + minmax.values());
            System.out.println("          Higher price of the game:               ");
            System.out.println("Strategy №2: " + maxmin.keySet() + " . Value: " + maxmin.values());
        }
    }
}
