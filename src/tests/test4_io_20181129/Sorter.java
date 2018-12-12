package tests.test4_io_20181129;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sorter {
    String inputFile;
    String outputFile;

    String line;

    public static void readFile(String inputFile) {
        String line;

        try {
            FileReader fileReader =
                    new FileReader(inputFile);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("[\\s]"); // spliting words in a line by spaces
                for (String word : words) {
                    System.out.println(word);
                }
            }

            bufferedReader.close();
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + inputFile + "'");
        } catch(IOException ex) {
            System.out.println("Error reading file '" + inputFile + "'");
        }
    }

    public void sort() {

    }
}
