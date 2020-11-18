package tools;

import tools.MatrixOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GurvitzCriteria {

    public void gurvitzprocess( int [][] array, double k)
    {
        double [] min_each_rows_values  = new double [array.length];
        double [] max_each_rows_values = new double [array.length];
        double [] sum_min_max = new double [array.length];
        int min_value_rows = 10000;
        int max_value_rows = 0;
        double k_r = 1 - k;
        double max_value = 0;
        List<Integer> solution = new ArrayList<>();
        solution.add(1);
        MatrixOperations matrix = new MatrixOperations();
        FindBestSolution find = new FindBestSolution();

        System.out.println("--------------------Gurvitz Criteria--------------------");
        min_each_rows_values = matrix.minValuesInRowDouble(array);

        System.out.println("The minimum of each row:");
        matrix.printMatrixDouble1D(min_each_rows_values);

        max_each_rows_values = matrix.maxValuesInRowDouble(array);

        System.out.println("The maximum of each row:");
        matrix.printMatrixDouble1D(max_each_rows_values);

        for(int i = 0; i < array.length; i++)
        {
            min_each_rows_values[i] = min_each_rows_values[i] * k;
            max_each_rows_values[i] = max_each_rows_values[i] * k_r;
        }

        System.out.println("The minimum of each row after multiplication on coefficient:");
        matrix.printMatrixDouble1D(min_each_rows_values);

        System.out.println("The maximum of each row after multiplication on coefficient:");
        matrix.printMatrixDouble1D(max_each_rows_values);

        for(int i = 0; i < array.length; i++)
        {
            sum_min_max[i] = min_each_rows_values[i] + max_each_rows_values[i];
        }

        System.out.println("The sum of maximum and minimum values:");
        matrix.printMatrixDouble1D(sum_min_max);



        find.findingbest(sum_min_max);


        System.out.println("--------------------------------------------------------");

    }
}
