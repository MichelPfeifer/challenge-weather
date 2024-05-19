package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class WeatherAnalyzerTest {
    @Test
    public void findWeatherWithSmallestTempSpread(){
        WeatherAnalyzer analyzer = new WeatherAnalyzer();
        List<String[]> weatherData = Arrays.asList(
                new String[]{"Day", "MxT", "MxN"},
                new String[]{"1", "88", "59"},
                new String[]{"2", "79", "63"},
                new String[]{"3", "77", "55"}
        );
        String result = analyzer.findDayWithSmallestTempSpread(weatherData);
        assertEquals("2", result);
    }
}
