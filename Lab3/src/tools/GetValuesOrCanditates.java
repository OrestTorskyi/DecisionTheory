package tools;

import java.util.ArrayList;
import java.util.List;

public class GetValuesOrCanditates {

    public int [] getValues (List<String> list)
    {
        int matrixHeight = list.size();
        int [] matrix = new int[matrixHeight];

        for(int i = 0; i < matrix.length; i++)
        {

                String [] line = list.get(i).split(" ");
                matrix[i] = Integer.parseInt(line[0]);

        }
        return matrix;
    }

    public String[][] getCandidates (List<String> list)
    {
        int matrixWidth = list.get(0).split(" ").length - 1;
        int matrixHeight = list.size();
        String [][] candidates = new String[matrixHeight][matrixWidth];

        for(int i = 0; i < candidates.length; i++)
        {
            for (int j = 1; j < list.get(i).split(" ").length; j++)
            {
                String [] line = list.get(i).split(" ");
                candidates[i][j-1] = line[j];
            }
        }
        return candidates;
    }



}
