package tools;

public class VariantDescription {
    public void descriptionprocess(double [] v1, double [] v2, double [] v3)
    {
        System.out.println("\tVariant №1: Building a big fabric in the first year.");
        System.out.println("Price: " + v1[0]);
        System.out.println("Income: " + v1[1]);
        System.out.println("Income proability: " + v1[2]);
        System.out.println("Loss: " + v1[3]);
        System.out.println("Loss probability " + v1[4]);

        System.out.println("\tVariant №2: Building a small fabric in the first year.");
        System.out.println("Price: " + v2[0]);
        System.out.println("Income: " + v2[1]);
        System.out.println("Income probability: " + v2[2]);
        System.out.println("Loss: " + v2[3]);
        System.out.println("Loss probability " + v2[4]);

        System.out.println("\tVariant №3: Building a big fabric from second year having analyzed the project.");
        System.out.println("Price: " + v1[0]);
        System.out.println("Income: " + v1[1]);
        System.out.println("Income probability: " + v3[2]);
        System.out.println("Loss: " + v1[3]);
        System.out.println("Loss probability " + v3[3]);

        System.out.println("\tVariant №4: Building a small fabric from second year having analyzed the project.");
        System.out.println("Price: " + v2[0]);
        System.out.println("Income: " + v2[1]);
        System.out.println("Income probability: " + v3[2]);
        System.out.println("Loss: " + v2[3]);
        System.out.println("Loss probability " + v3[3]);

    }
}
