package tools;

public class BestDecisionFormula {

    public double finddecisionvalue(double[] array, int years) {


        double value = ((array[1] * array[2] + array[3] * array[4]) / array[0]) * years;
        return value;
    }
}


