package com.company;

import tools.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input file: ");
        String path = sc.nextLine();
        MatrixOpertions variant = new MatrixOpertions();

        List<String> variantlist = new ArrayList<>();
        variantlist = variant.readingMatrixFromFile(path);
        variant.printArrayList(variantlist);


        GetValuesOrCanditates splitmatrix = new GetValuesOrCanditates();
        String [][] candidates = splitmatrix.getCandidates(variantlist);
        int [] values = splitmatrix.getValues(variantlist);

        CondorcetMethod condorcet = new CondorcetMethod();
        condorcet.condorcetprocess(values,candidates);

        BordMethod bord = new BordMethod();
        bord.bordMethodProcess(values,candidates);

    }
}
