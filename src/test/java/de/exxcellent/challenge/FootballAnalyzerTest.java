package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballAnalyzerTest {

    @Test
    public void findTeamWithSmallestGoalDifference() {
        FootballAnalyzer analyzer = new FootballAnalyzer();
        List<String[]> footballData = Arrays.asList(
                new String[]{"Team", "Games", "Wins", "Losses", "Draws", "Goals", "Goals Allowed", "Points"},
                new String[]{"Arsenal", "38", "26", "9", "3", "79", "36", "87"},
                new String[]{"Liverpool", "38", "26", "9", "3", "55", "54", "66"},
                new String[]{"Leeds", "38", "26", "9", "3", "120", "30", "35"}
        );
        String result = analyzer.findTeamWithSmallestGoalDifference(footballData);
        assertEquals("Liverpool", result);
    }
}
