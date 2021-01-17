package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MatrixOperations {


    public HashMap<Integer,Integer> minRowMaxColumn(int[][] array)
    {
        int min = 10000;
        int max = 0, strategy = 0;
        int[] min_in_rows = new int[array.length];
        HashMap<Integer,Integer> minimum_maximum_value = new HashMap<>();
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(min > array[i][j])
                {
                   min = array[i][j];
                }
            }
            min_in_rows[i] = min;
            min = 10000;
        }

        for(int i = 0; i < min_in_rows.length; i++)
        {
            if(max < min_in_rows[i])
            {
                max = min_in_rows[i];
                strategy = i + 1;
            }
        }
        minimum_maximum_value.put(strategy,max);

        return minimum_maximum_value;
    }


    public HashMap<Integer,Integer> maxColumnMinRow(int[][] array)
    {
        int min = 10000;
        int max = 0, strategy = 0;
        int[] max_in_columns = new int[array.length];
        HashMap<Integer,Integer> maximum_minimum_value = new HashMap<>();

        for(int i = 0; i < array[0].length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(max < array[j][i])
                {
                    max = array[j][i];
                }
            }
            max_in_columns[i] = max;
            max = 0;
        }

        for(int i = 0; i < max_in_columns.length; i++)
        {
            if(min > max_in_columns[i])
            {
                min = max_in_columns[i];
                strategy = i + 1;
            }
        }
        maximum_minimum_value.put(strategy,min);

        return maximum_minimum_value;
    }


   public int[][] deleteRow(int[][]array,int index_of_row)
   {
       int [][]array_changed = new int[array.length - 1][array[0].length];

       for (int i = 0; i < array.length; i++)
       {
           if (i + 1 == array.length)
           {
               break;
           }
           for (int j = 0; j < array[0].length; j++)
           {
                   array_changed[i][j] = array[i >= index_of_row ? i + 1 : i][j];
           }
       }

       return array_changed;
   }

    public int[][] deleteColumn(int[][]array,int index_of_row)
    {
        int [][]array_changed = new int[array.length][array[0].length - 1];

        for (int i = 0; i < array[0].length; i++)
        {
            if (i + 1 == array[0].length)
            {
                break;
            }
            for (int j = 0; j < array.length; j++)
            {

                array_changed[j][i] = array[j][i >= index_of_row ? i + 1 : i];
            }
        }

        return array_changed;
    }

    public int[][] convertListToArray(ArrayList<ArrayList<Integer>> array_list)
    {
        int[][] array = new int[array_list.size()][array_list.get(0).size()];
        ArrayList<Integer> array_row_list = new ArrayList<>();
        for(int i = 0; i < array.length; i++)
        {
            array_row_list = array_list.get(i);

            for(int j = 0; j < array[i].length; j++)
            {
                array[i][j] = array_row_list.get(i).intValue();
            }
            array_row_list = null;
        }
        return array;
    }



    public  int [][] readingMatrixFromFile(String path) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(path));

        List<String> matrixlist = new ArrayList<>();

        while (file.ready())
        {
            matrixlist.add(file.readLine());
        }

        int matrixWidth = matrixlist.get(0).split(" ").length;
        int matrixHeight = matrixlist.size();
        int [][] matrix = new int[matrixHeight][matrixWidth];

        for(int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                String [] line = matrixlist.get(i).split(" ");
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }


        return matrix;

}



    public void printMatrixInt2D (int [][] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}
