package de.exxcellent.challenge;

import java.io.IOException;
import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) throws IOException {

        // Create reader
        CsvReader csvReader = new CsvReader();

        // Analyze weather file
        List<String[]> weatherData = csvReader.readCsvFile("src/main/resources/de/exxcellent/challenge/weather.csv");
        WeatherAnalyzer weatherAnalyzer = new WeatherAnalyzer();

        String dayWithSmallestTempSpread = weatherAnalyzer.findDayWithSmallestTempSpread(weatherData);     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        // Analyze football data
        List<String[]> footballData = csvReader.readCsvFile("src/main/resources/de/exxcellent/challenge/football.csv");
        FootballAnalyzer footballAnalyzer = new FootballAnalyzer();

        String teamWithSmallestGoalSpread = footballAnalyzer.findTeamWithSmallestGoalDifference(footballData); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
