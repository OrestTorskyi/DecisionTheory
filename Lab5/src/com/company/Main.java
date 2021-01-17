package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main{

public static void main(String[] args) throws IOException {

        System.out.println("Input file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        MatrixOperations matrix = new MatrixOperations();
        ClearStrategy clearstrategy = new ClearStrategy();
        DominationRowsColumnsSearch domination = new DominationRowsColumnsSearch();
        int [][] array = matrix.readingMatrixFromFile(path);
        int [][] array_domination = null;
        clearstrategy.clearStrategyCheck(matrix.minRowMaxColumn(array),matrix.maxColumnMinRow(array));
        System.out.println("--------------------Check for dominating rows and columns:---------------------");
        System.out.println("\t\tMatrix:");
        matrix.printMatrixInt2D(array);
        System.out.println("Deleting dominating rows and columns:");
        domination.simpled_array(array);
        matrix.printMatrixInt2D(array_domination);
        /*array_domination = domination.simpled_array_by_rows(array);
        System.out.println("After deleting dominating rows:");
        matrix.printMatrixInt2D(array_domination);

        System.out.println("After deleting dominating columns:");
        array_domination = domination.simpled_array_by_columns(array_domination);
        matrix.printMatrixInt2D(array_domination);*/

        }

}

