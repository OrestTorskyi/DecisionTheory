package tools;

import java.util.ArrayList;
import java.util.List;

public class FindBestSolution {

    public List<Integer> findingbest (double [] array)
    {
        double max_value = 0;
        List<Integer> solution = new ArrayList<>();
        solution.add(1);

        for(int i = 0; i < array.length; i++)
        {
            if(max_value <= array[i])
            {
                if(max_value == array[i])
                {
                    solution.add(i+1);
                }
                else {
                    max_value = array[i];
                    solution.set(solution.size()-1,i+1);
                }
            }
        }

        /*if(solution.size() == 1)
        {
            System.out.println("The best solution is row №: " + solution.get(0) + " Value: " + max_value);

        }
        else if(solution.size() == 2)
        {
            System.out.println("The best solution is row №: " + solution.get(0) + " or row №: " + solution.get(1) + ". Value: " + max_value);
        }
        else if(solution.size() == 3)
        {
            System.out.println("All strategies are effective. Value: " + max_value);
        }
*/
        return solution;
    }


}
