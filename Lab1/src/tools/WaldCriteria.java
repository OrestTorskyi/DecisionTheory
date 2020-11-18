package tools;

import tools.MatrixOperations;

import java.util.ArrayList;
import java.util.List;

public class WaldCriteria {

    public void waldprocess( int [][] array )
    {
        double [] a = new double [array.length];

        List<Integer>solution = new ArrayList<>();
        solution.add(1);
        MatrixOperations matrix = new MatrixOperations();
        FindBestSolution find = new FindBestSolution();

        System.out.println("--------------------Wald Criteria--------------------");
        a = matrix.minValuesInRowDouble(array);

        System.out.println("The minimum of each row:");
        matrix.printMatrixDouble1D(a);

        find.findingbest(a);


        System.out.println("-----------------------------------------------------");

    }
}
