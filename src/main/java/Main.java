import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends JerkSONParser {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public ArrayList readRawDataToArray() throws Exception{
        BufferedReader bufReader = new BufferedReader(new FileReader("RawData.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();

        String line = bufReader.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = bufReader.readLine();
        }
        bufReader.close();
        return listOfLines;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        output = new JerkSONParser().changeSeparator(output);

        System.out.println(output);

    }
}
