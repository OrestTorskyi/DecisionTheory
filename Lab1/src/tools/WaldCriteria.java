package tools;

import tools.MatrixOperations;

import java.util.ArrayList;
import java.util.List;

public class WaldCriteria {

    public void waldprocess( int [][] array )
    {
        double [] a = new double [array.length];

        List<Integer>solution = new ArrayList<>();
        MatrixOperations matrix = new MatrixOperations();
        FindBestSolution find = new FindBestSolution();

        System.out.println("--------------------Wald Criteria--------------------");
        a = matrix.minValuesInRowDouble(array);

        System.out.println("The minimum of each row:");
        matrix.printMatrixDouble1D(a);

        solution = find.findingbest(a);

        matrix.printRowIn2DMatrix(array,solution);


        System.out.println("-----------------------------------------------------");

    }
}
