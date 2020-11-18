package tools;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MatrixOperations {


    public int [] maxValuesInRowInt (int [][] array)
    {
        int max_in_row = 0;
        int [] max_in_each_row = new int[array.length];

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(max_in_row < array[i][j])
                {
                    max_in_row = array[i][j];
                }
            }
            max_in_each_row[i] = max_in_row;
            max_in_row = 0;
        }
        return max_in_each_row;
    }

    public double [] maxValuesInRowDouble (int [][] array)
    {
        double max_in_row = 0;
        double [] max_in_each_row = new double[array.length];

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(max_in_row < array[i][j])
                {
                    max_in_row = array[i][j];
                }

            }
            max_in_each_row[i] = max_in_row;
            max_in_row = 0;
        }
        return max_in_each_row;
    }

    public int [] minValuesInRowInt (int [][] array)
    {
        int min_in_row = array[0][0];
        int [] min_in_each_row = new int[array.length];

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(min_in_row > array[i][j])
                {
                    min_in_row = array[i][j];
                }
            }
            min_in_each_row[i] = min_in_row;
            min_in_row = array[i][0];
        }
        return min_in_each_row;
    }

    public double [] minValuesInRowDouble (int [][] array)
    {
        double min_in_row = 10000;
        double [] min_in_each_row = new double[array.length];

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(min_in_row > array[i][j])
                {
                    min_in_row = array[i][j];
                }

            }
            min_in_each_row[i] = min_in_row;
            min_in_row = array[i][0];
        }
        return min_in_each_row;
    }

    public double[] sumOfRows(double[][] array)
    {
        double row_sum = 0;
        double [] total_sum_rows = new double[array.length];
        for (int i = 0; i < array.length; i++)
        {
                for (int j = 0; j < array[i].length; j++)
                {
                    row_sum += array[i][j];
                }
            total_sum_rows[i] = row_sum;
            row_sum = 0;
        }

        return total_sum_rows;
    }

    public void printMatrixInt1D (int [] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public void printMatrixDouble1D (double [] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
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

    public void printMatrixDouble2D (double [][] array)
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



    }



