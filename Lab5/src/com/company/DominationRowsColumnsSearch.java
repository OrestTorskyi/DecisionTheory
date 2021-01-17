package com.company;

public class DominationRowsColumnsSearch {

    public int[][] simpled_array_by_rows(int[][]array)
    {
        boolean dominating = false;
        int[][] array_changed = null;
        MatrixOperations matrix = new MatrixOperations();

        start:
        {
            for (int i = 0; i < array.length; i++) {
                for (int k = 0; k < array.length; k++) {
                    if (i == k) {
                        continue;
                    } else {
                        for (int j = 0; j < array[i].length; j++) {

                            if (array[i][j] >= array[k][j]) {
                                dominating = true;
                            } else {
                                dominating = false;
                                break;
                            }

                        }
                        if (dominating) {
                            array_changed = matrix.deleteRow(array, k);
                            //simpled_array_by_rows(array_changed);
                            break start;
                        } else
                            {
                            continue;
                        }
                    }
                }
            }
        }

        if (array_changed == null)
        {
            return array;
        }
        else
        {
            return array_changed;
        }
    }



    public int[][] simpled_array_by_columns(int[][]array) {
        boolean dominating = false;
        int[][] array_changed = null;
        MatrixOperations matrix = new MatrixOperations();

        start:
        {
            for (int i = 0; i < array[0].length; i++) {
                for (int k = 0; k < array[0].length; k++) {
                    if (i == k) {
                        continue;
                    } else {
                        for (int j = 0; j < array.length; j++) {

                            if (array[j][i] <= array[j][k]) {
                                dominating = true;
                            } else {
                                dominating = false;
                                break;
                            }

                        }
                        if (dominating) {
                            array_changed = matrix.deleteColumn(array, k);
                            //simpled_array_by_columns(array_changed);
                            break start;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }


        if (array_changed == null)
        {
            return array;
        }
        else
        {
            return array_changed;
        }
    }

    public void simpled_array(int[][] array)
    {
        int [][] array_changed;
        MatrixOperations matrix = new MatrixOperations();
        int row_length, column_length, row_length_c, column_length_c;
        row_length = array.length;
        column_length = array[0].length;
        array_changed = simpled_array_by_rows(array);
        array_changed = simpled_array_by_columns(array_changed);
        row_length_c = array_changed.length;
        column_length_c = array_changed[0].length;
        if(row_length != row_length_c || column_length != column_length_c)
        {
            matrix.printMatrixInt2D(array_changed);
            simpled_array(array_changed);

        }



    }
}
