package tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CondorcetMethod {
public void condorcetprocess (int [] array_values, String [][] array_candidates)
{
    String [] array_row = new String[array_candidates[0].length];
    List<String> candidates_row = new ArrayList<>();
    int a_wins = 0, b_wins = 0, c_wins = 0;
    CompareCandidates compareprocess = new CompareCandidates();

    System.out.println("-------------------------Condorcet Method-----------------------------");
/*
   for(int i = 0; i < array_values.length; i++)
    {
        System.out.print(array_values[i] + " ");
    }

    for(int i = 0; i < array_candidates.length; i++)
    {
        for(int j = 0; j < array_candidates[i].length; j++)
        {
            System.out.print(array_candidates[i][j] + " ");
        }
        System.out.println("\n");
    }

*/
   List<String> winners = new ArrayList<>();

   winners.add(compareprocess.comparingTwoCandidates(array_values,array_candidates,"A","B"));
   winners.add(compareprocess.comparingTwoCandidates(array_values,array_candidates,"A","C"));
   winners.add(compareprocess.comparingTwoCandidates(array_values,array_candidates,"B","C"));

   a_wins = Collections.frequency(winners, "A");
   b_wins = Collections.frequency(winners,"B");
   c_wins = Collections.frequency(winners, "C");


    compareprocess.getBestCandidate(a_wins,b_wins,c_wins);
    System.out.println("--------------------------------------------------------------------");

    }


}

