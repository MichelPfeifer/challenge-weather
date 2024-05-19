package de.exxcellent.challenge;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class aims to read csv file content.
 */
public class CsvReader {

    /**
     * Method reads a CSV file and returns the content as a list of String arrays.
     * Every line of the CSV file is converted into a String array and added to the mentioned list and finally returned.
     * This method uses BufferedReader to read the file and FileReader to access the file through the file path.
     *
     * @param filePath - Path to CSV file containing data to be read.
     * @return csvData - List of String arrays representing the content of the CSV file.
     * @throws IOException - Overall exception in case an error occurs while reading the file.
     */

    public List<String[]> readCsvFile(String filePath) throws IOException {
        List<String[]> csvData = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] colData = line.split(",");
            csvData.add(colData);
        }
        return csvData;
    }

}
