package de.exxcellent.challenge;

import java.util.List;

public class FootballAnalyzer {

    public String findTeamWithSmallestGoalDifference(List<String[]> footballData) {
        String teamWithMinDiff = null;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < footballData.size(); i++){
            String[] row = footballData.get(i);
            String team = row[0];
            int goals = Integer.parseInt(row[5]);
            int goalsAllowed = Integer.parseInt(row[6]);
            int diff = Math.abs(goals - goalsAllowed);

            if (diff < minDiff){
                minDiff = diff;
                teamWithMinDiff = team;
            }

        }
        return teamWithMinDiff;
    }
}
