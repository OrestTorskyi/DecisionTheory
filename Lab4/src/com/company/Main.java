package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import tools.*;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Input file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        MatrixOperations matrix = new MatrixOperations();
        double [][] array = matrix.readingMatrixFromFile(path);
        String [] product_name = {"Canon M50      ", "Sony A6000     ", "Sony A6300     ", "Canon 200D    ", "Fuji XT-200    ", "Canon 650D     "};
        String [] criteria = {"Спрацювання затвору","Кадрів за сек.    ", "Ціна              ", "Вага              ", "Експертна оцінка  "};

        double [] expert_1_coefficients = {0.3,0.2,0.15,0.25,0.1};
        double [] expert_2_coefficients = {0.2,0.3,0.15,0.25,0.1};
        double [] expert_3_coefficients = {0.25,0.2,0.25,0.2,0.1};

        double [] expert_1_points = {6,7,8,7,9,6};
        double [] expert_2_points = {9,10,9,6,8,5};
        double [] expert_3_points = {8,8,6,8,7,9};

        double [] expert_1_conclusion = matrix.expertConclusion(array,expert_1_coefficients,expert_1_points);
        double [] expert_2_conclusion = matrix.expertConclusion(array,expert_2_coefficients,expert_2_points);
        double [] expert_3_conclusion = matrix.expertConclusion(array,expert_3_coefficients,expert_3_points);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Eксперт (Довготривалість використання)");
        matrix.print2DArray(array,expert_1_coefficients,expert_1_points,expert_1_conclusion,criteria, product_name);
        System.out.println("Eксперт (Динамічна зйомка)");
        matrix.print2DArray(array,expert_2_coefficients,expert_2_points,expert_2_conclusion,criteria, product_name);
        System.out.println("Eксперт (Збалансованість характеристик)");
        matrix.print2DArray(array,expert_3_coefficients,expert_3_points,expert_3_conclusion,criteria, product_name);


        double [] average_conclusion = matrix.expertAverageValue(expert_1_conclusion, expert_2_conclusion, expert_3_conclusion, 3);

        matrix.printAverageExpertPoints(average_conclusion);

        HashMap<Integer, Double> best_choice = matrix.findBestObject(average_conclusion);
        Set<Integer> key = best_choice.keySet();
        int index_of_best_product = (int) best_choice.keySet().toArray()[0];
        System.out.println("Найкраще рішення придбати - №" + index_of_best_product + ": " + product_name[index_of_best_product - 1]);

    }
}
