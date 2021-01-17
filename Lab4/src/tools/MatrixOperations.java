package tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MatrixOperations {

    public double[][] readingMatrixFromFile(String path) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(path));

        List<String> matrixlist = new ArrayList<>();

        while (file.ready()) {
            matrixlist.add(file.readLine());
        }

        int matrixWidth = matrixlist.get(0).split(" ").length;
        int matrixHeight = matrixlist.size();
        double[][] matrix = new double[matrixHeight][matrixWidth];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String[] line = matrixlist.get(i).split(" ");
                matrix[i][j] = Double.parseDouble(line[j]);
            }
        }


        return matrix;

    }


    public double[][] convertToTenPoint(double[][] array) {
        double[][] array_changed = new double[array.length][array[1].length];
        double max = 0;
        for (int i = 0; i < array_changed.length; i++) {
            for (int j = 0; j < array_changed[i].length; j++) {
                for (int k = 0; k < array_changed[i].length; k++) {
                    if(max < array[i][k])
                    {
                        max = array[i][k];
                    }
                }
                if(i == 0)
                array_changed[i][j] = 10 - (array[i][j] / max) * 10;
                else
                array_changed[i][j] = (array[i][j] / max) * 10;
                max = 0;
            }
        }

        return array_changed;
    }

    public double[] expertConclusion(double[][] array, double[] coefficient, double[] expert_estimation) {
        double[] array_expert = new double[array[1].length];
        double sum = 0;
        for (int i = 0; i < array[1].length; i++) {
            for (int j = 0; j < coefficient.length; j++) {
                if (j == 4) {
                    sum += coefficient[j] * expert_estimation[i];
                } else {
                    sum += coefficient[j] * array[j][i];
                }
            }
            array_expert[i] = sum;
            sum = 0;
        }
        return array_expert;
    }

    public double[] expertAverageValue(double[] expert_1, double[] expert_2, double[] expert_3, int number_of_experts) {
        double[] average_values = new double[expert_1.length];

        for (int i = 0; i < expert_1.length; i++) {
            average_values[i] = (expert_1[i] + expert_2[i] + expert_3[i]) / number_of_experts;
        }

        return average_values;
    }

    public HashMap<Integer, Double> findBestObject(double[] array) {
        double max_value = 0;
        int index = 0;
        HashMap<Integer, Double> best_object = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (max_value < array[i]) {
                max_value = array[i];
                index = i + 1;
            }
        }

        best_object.put(index, max_value);

        return best_object;
    }

    public void print2DArray(double[][] array, double[] coefficients, double[] expert_point, double[] expert_conclusion, String[] criteria, String[] objects) {

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.print("№\tПараметр\t\t\tВага\t");
        for (int i = 0; i < objects.length; i++) {
            System.out.print("\t" + objects[i] + "\t");
        }

        System.out.println("\n");
        for (int i = 0; i < criteria.length; i++) {
            if (i == 4)
            {
                System.out.print("№" + (i + 1));
                System.out.print("\t" + criteria[i]);
                String coefficients_formatted = String.format("%.2f", coefficients[i]);
                System.out.print("\t" + coefficients_formatted + "\t");
                    for (int k = 0; k < expert_point.length; k++)
                    {
                        String expert_point_formatted = String.format("%.1f", expert_point[k]);
                        System.out.print("\t\t|" + expert_point_formatted + "|\t\t");
                    }

                System.out.println("\n");
            }
            else
            {
                System.out.print("№" + (i + 1));
                System.out.print("\t" + criteria[i]);
                String coefficients_formatted = String.format("%.2f", coefficients[i]);
                System.out.print("\t" + coefficients_formatted + "\t");
                for (int j = 0; j < array[i].length; j++)
                {
                    String array_formatted = String.format("%.1f", array[i][j]);
                    System.out.print("\t\t|" + array_formatted + "|\t\t");
                }
                System.out.println("\n");

            }




        }

        System.out.print("Сума: " + "\t\t\t\t" + " \t1\t\t");
        for (int h = 0; h < expert_conclusion.length; h++) {
            String expert_conclusion_formatted = String.format("%.1f", expert_conclusion[h]);
            System.out.print("\t\t|" + expert_conclusion_formatted + "|\t\t");
        }


        System.out.println("\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void printAverageExpertPoints(double[] expert_average_point)
    {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Середня оцінка: \t\t\t\t");
        for (int i = 0; i < expert_average_point.length; i++)
        {
            String expert_average_point_formatted = String.format("%.1f", expert_average_point[i]);
            System.out.print("\t\t|" + expert_average_point_formatted + "|\t\t");
        }
        System.out.println("\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}