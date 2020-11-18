package com.company;
import tools.BestSolution;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Input file name: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        BestSolution scanning = new BestSolution();
        scanning.scanningprocess(path);


    }
}
