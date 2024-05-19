package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvReaderTest {
    @Test
    public void testReadCsvWeatherFile() throws IOException {
        CsvReader csvReader = new CsvReader();
        List<String[]> csvData = csvReader.readCsvFile("src/main/resources/de/exxcellent/challenge/weather.csv");

        assertEquals(31, csvData.size());
        assertEquals("Day", csvData.get(0)[0]);
        assertEquals("MxT", csvData.get(0)[1]);
        assertEquals("1", csvData.get(1)[0]);
    }

    @Test
    public void testReadCsvFootballFile() throws IOException{
        CsvReader csvReader = new CsvReader();
        List<String[]> csvData = csvReader.readCsvFile("src/main/resources/de/exxcellent/challenge/football.csv");

        assertEquals(21, csvData.size());
        assertEquals("Team", csvData.get(0)[0]);
        assertEquals("Games", csvData.get(0)[1]);
        assertEquals("Arsenal", csvData.get(1)[0]);
    }
}
