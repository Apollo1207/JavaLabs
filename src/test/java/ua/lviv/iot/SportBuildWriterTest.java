package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.IOmanager.SportBuildWriter;
import ua.lviv.iot.model.*;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SportBuildWriterTest {
    @Test
    public void inputManager() throws IOException {
        FootballField footballField = new FootballField(50, 2008, "Lviv", 848, "Football", RoofType.OPEN, "green", 54);
        AthleticsField athleticsField = new AthleticsField(100, 2005, "Paris",
                953, "Athletics", 6,
                9, "rubber");
        SwimmingPool swimmingPool = new SwimmingPool(6, 1995, "New-York",
                921, "Swimming", 8,
                9, PurificationSystem.ULTRAVIOLET);
        SportBuildWriter.inputTextToFile("text.csv", footballField.toCSV(), athleticsField.toCSV(), swimmingPool.toCSV());
    }

    @Test
    public void outputManager() throws IOException {
        SportBuildWriter.outputTextOfFile("text.csv");
    }

    @Test
    public void inputAndOutputTest() throws IOException {
        FootballField footballField = new FootballField(50, 2008, "Lviv", 848, "Football", RoofType.OPEN, "green", 54);
        AthleticsField athleticsField = new AthleticsField(100, 2005, "Paris",
                953, "Athletics", 6,
                9, "rubber");
        SwimmingPool swimmingPool = new SwimmingPool(6, 1995, "New-York",
                921, "Swimming", 8,
                9, PurificationSystem.ULTRAVIOLET);
        SportBuildWriter.inputTextToFile("text.csv", footballField.toCSV(), athleticsField.toCSV(), swimmingPool.toCSV());
        SportBuildWriter.outputTextOfFile("text.csv");
    }

    @Test
    public void stringWriterTest() throws IOException {
        try {
            FootballField footballField = new FootballField(50, 2008, "Lviv", 848, "Football", RoofType.OPEN, "green", 54);
            AthleticsField athleticsField = new AthleticsField(100, 2005, "Paris",
                    953, "Athletics", 6,
                    9, "rubber");
            SwimmingPool swimmingPool = new SwimmingPool(6, 1995, "New-York",
                    921, "Swimming", 8,
                    9, PurificationSystem.ULTRAVIOLET);
            SportBuildWriter sportBuildStringWriterFootballField = new SportBuildWriter(new StringWriter());
            SportBuildWriter sportBuildStringWriterAthleticsField = new SportBuildWriter(new StringWriter());
            SportBuildWriter sportBuildStringWriterSwimmingPool = new SportBuildWriter(new StringWriter());

            sportBuildStringWriterFootballField.inputTextFootballField(footballField.toCSV());
            sportBuildStringWriterAthleticsField.inputTextAthleticsField(athleticsField.toCSV());
            sportBuildStringWriterSwimmingPool.inputTextSwimmingPool(swimmingPool.toCSV());

            String expectedExpressionFootballField = footballField.toCSV() + "\r\n";
            String expectedExpressionAthleticsField = athleticsField.toCSV() + "\r\n";
            String expectedExpressionSwimmingPool = swimmingPool.toCSV() + "\r\n";

            assertEquals(expectedExpressionFootballField, sportBuildStringWriterFootballField.toString());
            assertEquals(expectedExpressionAthleticsField, sportBuildStringWriterAthleticsField.toString());
            assertEquals(expectedExpressionSwimmingPool, sportBuildStringWriterSwimmingPool.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
