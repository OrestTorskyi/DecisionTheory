package tools;

public class MatrixOperations {

    public void printmatrix1d(double [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public double [] maxvalue1d(double [] array)
    {
        double [] bestsolution = new double[2];
        double max = 0;
        double index = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(max < array[i])
            {
                max = array[i];
                index = i+1;
            }
        }

        bestsolution[0] = index;
        bestsolution[1] = max;

        return bestsolution;
    }

}
