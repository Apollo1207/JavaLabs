package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.SportBuild;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SportBuildWriterTest extends BaseConstructionManagerTest {

    @Test
    public void testFile() throws IOException {
        try (Writer fileWriter = new FileWriter("SportBuild.csv")) {
            SportBuildWriter writer = new SportBuildWriter();
            writer.setTextWriter(fileWriter);
            writer.writeToFile(builds);
        }
    }

    @Test
    public void testWriteToFile() throws IOException {
        try (Writer csvWriter = new StringWriter()) {
            SportBuildWriter writer = new SportBuildWriter();
            writer.setTextWriter(csvWriter);
            writer.writeToFile(builds);
            StringBuilder expectedString = new StringBuilder();
            for (SportBuild build : builds) {
                expectedString.append(build.getHeaders()).append("\n").append(build.toCSV()).append("\n");
            }
            assertEquals(expectedString.toString(), writer.toString());
        }
    }

}

