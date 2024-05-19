package de.exxcellent.challenge;

import java.util.List;

public class WeatherAnalyzer {
    public String findDayWithSmallestTempSpread(List<String[]> weatherData) {
        int dayWithMinSpread = -1;
        double minSprad = Double.MAX_VALUE;

        for (int i = 1; i < weatherData.size(); i++){
            String[] row = weatherData.get(i);
            int day = Integer.parseInt(row[0]);
            double maxTemp = Double.parseDouble(row[1]);
            double minTemp = Double.parseDouble(row[2]);
            double spread = maxTemp - minTemp;

            if (spread < minSprad){
                minSprad = spread;
                dayWithMinSpread = day;
            }

        }

        return String.valueOf(dayWithMinSpread);
    }
}
