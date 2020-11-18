package tools;

public class BestDecisionAnalysis{

    public double finddecisionvalue (double [] array, double [] array2, int years)
    {
        double value = ((array[1]*array2[2] + array[3]*array2[3]) / array[0]) * years;
        return value;
    }
}
