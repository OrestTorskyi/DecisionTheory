package tools;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import tools.MatrixOperations;
import tools.BestDecisionFormula;
import tools.BestDecisionAnalysis;
import tools.VariantDescription;
public class BestSolution {

    public void scanningprocess(String filename) throws IOException {

        BufferedReader file = new BufferedReader(new FileReader(filename));

        List<String> variants = new ArrayList<>();

        while (file.ready())
        {
            variants.add(file.readLine());
        }

        double [] v1 = new double[variants.get(0).split(" ").length];
        double [] v2 = new double[variants.get(1).split(" ").length];
        double [] v3 = new double[variants.get(2).split(" ").length];

        String [] line1 = variants.get(0).split(" ");
        String [] line2 = variants.get(1).split(" ");
        String [] line3 = variants.get(2).split(" ");

        for(int i = 0; i < v1.length; i++)
        {
            v1[i] = Double.parseDouble(line1[i]);
            v2[i] = Double.parseDouble(line2[i]);

        }

        for(int i = 0; i < v3.length; i++)
        {
            v3[i] = Double.parseDouble(line3[i]);
        }

        MatrixOperations matrix = new MatrixOperations();
        System.out.println("Matrix: ");
        matrix.printmatrix1d(v1);
        matrix.printmatrix1d(v2);
        matrix.printmatrix1d(v3);

        VariantDescription variant = new VariantDescription();
        variant.descriptionprocess(v1,v2,v3);

        double [] d = new double[4];
        double [] bestdecision = new double[2];
        BestDecisionFormula decision = new BestDecisionFormula();
        BestDecisionAnalysis decisionanalysis = new BestDecisionAnalysis();
        System.out.println("Formula: ((income * income probability + loss * loss probability) \\ price) * years");
        d[0] = decision.finddecisionvalue(v1,5);
        d[1] = decision.finddecisionvalue(v2,5);
        d[2] = decisionanalysis.finddecisionvalue(v1,v3,4);
        d[3] = decisionanalysis.finddecisionvalue(v2,v3,4);
        System.out.println("Variant №1. Formula result: " + d[0]);
        System.out.println("Variant №2. Formula result: " + d[1]);
        System.out.println("Variant №3. Formula result: " + d[2]);
        System.out.println("Variant №4. Formula result: " + d[3]);


        bestdecision = matrix.maxvalue1d(d);

        System.out.println("The best decision is variant № " + (int)bestdecision[0] + ". " + "Value: " + bestdecision[1]);

    }
}
