package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.*;

public class CompareCandidates {
    public String comparingTwoCandidates(int[] array_values, String[][] array_candidates, String first_candidate, String second_candidate) {
        String[] array_row = new String[array_candidates[0].length];
        List<String> candidates_row = new ArrayList<>();
        int first_count = 0, second_count = 0;

        for (int i = 0; i < array_candidates.length; i++)
        {

            for (int j = 0; j < array_candidates[i].length; j++)
            {
                array_row[j] = array_candidates[i][j];
            }
            candidates_row = Arrays.asList(array_row);

            if (candidates_row.indexOf(first_candidate) < candidates_row.indexOf(second_candidate))
            {
                first_count += array_values[i];
            }
            else
            {
                second_count += array_values[i];
            }

            candidates_row = null;

        }


        if(first_count == Math.max(first_count, second_count))
        {
            System.out.println("Comparing two candidates using candidates' priorities: " + first_candidate + " and " + second_candidate + " . " + first_candidate + " wins. Value: " + first_count);
            return first_candidate;
        }
        else
        {
            System.out.println("Comparing two candidates using candidates' priorities: " + first_candidate + " and " + second_candidate + " . " + second_candidate + " wins. Value: " + second_count);
            return second_candidate;
        }


    }

    public void getBestCandidate (int a_count, int b_count, int c_count)
    {

        if(a_count == Math.max(Math.max(a_count,b_count),c_count))
            {
                    System.out.println("Condorcet method result: the best candidate is 'A'.");
            }
        else if(b_count == Math.max(Math.max(a_count,b_count),c_count))
            {
                System.out.println("Condorcet method result: the best candidate is 'B'.");
            }
        else
            {
                System.out.println("Condorcet method result: the best candidate is 'C'.");
            }

    }



}

