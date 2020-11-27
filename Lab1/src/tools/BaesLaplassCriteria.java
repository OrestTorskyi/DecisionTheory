package tools;

import tools.MatrixOperations;

import java.util.ArrayList;
import java.util.List;

public class BaesLaplassCriteria {
    public void baeslaplassprocess(int array[][], double k1, double k2, double k3) {
        double[][] total_value_array = new double[array.length][array[0].length];
        double[] A = new double[array[0].length];
        double[] k_total = {k1, k2, k3};
        double sum = 0;
        double[] total_values = new double[array.length];
        double max_value = 0;
        List<Integer> solution = new ArrayList<>();
        MatrixOperations matrix = new MatrixOperations();
        FindBestSolution find = new FindBestSolution();

        System.out.println("--------------------Bayes-Laplace Criteria--------------------");

        System.out.println("Bayes-Laplace formula: A[1]*k1 + A[2] * k2 + A[3] * k3 - for each row in array");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j] * k_total[j];
            }

            total_values[i] = sum;
            sum = 0;
        }

        System.out.println("The sum of rows:");
        matrix.printMatrixDouble1D(total_values);



        solution = find.findingbest(total_values);
        matrix.printRowIn2DMatrix(array,solution);
        System.out.println("-------------------------------------------------------------");
    }
}
