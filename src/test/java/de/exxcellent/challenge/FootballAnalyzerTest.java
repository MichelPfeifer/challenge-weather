package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * This class aims to test the methods of class FootballAnalyzer
 */
public class FootballAnalyzerTest {

    /**
     * This test method aims to test if the team with the smallest goal difference is found by
     * the method findTeamWithSmallestGoalDifference.
     * It tests the difference with custom dataframe and dummy values.
     */
    @Test
    public void testFindTeamWithSmallestGoalDifference() {
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
