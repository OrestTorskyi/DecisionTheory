package tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingMatrixFromFile {

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
