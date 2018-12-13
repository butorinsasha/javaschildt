package tests.test4_io_20181129;

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FIleLinesLengthSorter {

    public static String[] sortStrArray(String[] array){
        //sort arrays by length before returning
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(),b.length());//specifying compare type that is compare with length
            }
        });
        return array;
    }

    public static void main(String[] args) {
        String line = null;
        List<String> linesList = new ArrayList<>();
        String[] linesArray = null;
        String[] sortedLinesArray = null;

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
             FileWriter fw = new FileWriter(args[1]))
        {
            while ((line = br.readLine()) != null) {
//                line = line + "\r\n";
//                fw.write(line);
                linesList.add(line);
            }

            linesArray = new String [linesList.size()];
            linesArray = linesList.toArray(linesArray);
            sortedLinesArray = sortStrArray(linesArray);

            for (String sortedLine : sortedLinesArray) {
                sortedLine = sortedLine + "\n\r";
                fw.write(sortedLine);
            }

        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
        }
    }
}
