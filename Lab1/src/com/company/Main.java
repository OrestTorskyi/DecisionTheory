package com.company;
import tools.*;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Input file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        MatrixOperations matrix = new MatrixOperations();
        int [][] array = matrix.readingMatrixFromFile(path);
        WaldCriteria wald = new WaldCriteria();
        GurvitsCriteria gurvitz = new GurvitsCriteria();
        LaplassCriteria laplass = new LaplassCriteria();
        BaesLaplassCriteria baeslaplass = new BaesLaplassCriteria();
        wald.waldprocess(array);
        laplass.laplassprocess(array);
        gurvitz.gurvitzprocess(array,0.2);
        baeslaplass.baeslaplassprocess(array, 0.5,0.35,0.15);

    }
}
