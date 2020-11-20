package tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixOpertions {

    public void printArrayList(List<String> variant)
    {
        System.out.println("\t\t\t\tVariant:");
        System.out.println("\t\t\t\tPriorities");
        System.out.println("   Votes\t" + "№1\t" + "\t№2\t" + "\t№3");

        for(int i = 0; i < variant.size(); i++)
        {
            for(int j = 0; j < variant.get(i).split(" ").length; j++)
            {
                String [] line = variant.get(i).split(" ");
                System.out.print("\t" + line[j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public  List<String> readingMatrixFromFile(String path) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(path));

        List<String> matrixlist = new ArrayList<>();

        while (file.ready())
        {
            matrixlist.add(file.readLine());
        }

        return matrixlist;

    }
}
