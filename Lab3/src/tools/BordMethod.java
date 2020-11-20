package tools;

import java.util.List;

public class BordMethod {
    public void bordMethodProcess(int [] array_values, String [][] candidates_priorities)
    {
        int [] a_candidate_marks, b_candidates_marks, c_candidates_marks = new int [array_values.length];
        int a_total_value = 0, b_total_value = 0, c_total_value = 0;
        CompareCandidates comparing = new CompareCandidates();
        a_candidate_marks = comparing.setMarksForCandidate(candidates_priorities, "A");
        b_candidates_marks = comparing.setMarksForCandidate(candidates_priorities,"B");
        c_candidates_marks = comparing.setMarksForCandidate(candidates_priorities,"C");

        System.out.println("----------------------------Bord Method---------------------------------");
        System.out.println("Formula: [number of voters №0]*[priority of candidate] + ... +  [number of voters №n]*[priority of candidate] = [Total mark of candidate]");
        for(int i = 0; i < array_values.length; i++)
        {
            a_total_value += a_candidate_marks[i]*array_values[i];
            b_total_value += b_candidates_marks[i]*array_values[i];
            c_total_value += c_candidates_marks[i]*array_values[i];
        }

        System.out.println("Marks of each candidate:");
        System.out.println("A: " + a_total_value);
        System.out.println("B: " + b_total_value);
        System.out.println("C: " + c_total_value);

        comparing.getBestCandidate(a_total_value,b_total_value,c_total_value);

        System.out.println("--------------------------------------------------------------------------");
    }
}
