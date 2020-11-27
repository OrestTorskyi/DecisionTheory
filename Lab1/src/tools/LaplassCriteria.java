package tools;

import tools.*;

import java.util.ArrayList;
import java.util.List;


public class LaplassCriteria {

    public void laplassprocess(int[][] array) {
        int k = array.length;
        double[][] array_changed = new double[array.length][array[0].length];
        double[] total_sum_rows = new double[array.length];
        double row_sum = 0;
        double max_value = 0;
        List<Integer> solution = new ArrayList<>();
        MatrixOperations matrix = new MatrixOperations();
        FindBestSolution find = new FindBestSolution();


        System.out.println("--------------------Laplace Criteria--------------------");


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array_changed[i][j] = (double) array[i][j] / k;
            }
        }

        System.out.println("Array after division on coefficient:");
        matrix.printMatrixDouble2D(array_changed);


        total_sum_rows = matrix.sumOfRows(array_changed);

        System.out.println("The sum of rows:");
        matrix.printMatrixDouble1D(total_sum_rows);



        solution = find.findingbest(total_sum_rows);
        matrix.printRowIn2DMatrix(array,solution);

        System.out.println("--------------------------------------------------------");

    }
}
