package tools;

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
}
