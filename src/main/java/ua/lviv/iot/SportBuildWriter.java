package ua.lviv.iot;

import ua.lviv.iot.model.SportBuild;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class SportBuildWriter {
    private Writer textWriter;

    public void setTextWriter(Writer textWriter) {
        this.textWriter = textWriter;
    }

    public void writeToFile(List<SportBuild> builds) throws IOException {
        for (SportBuild build : builds) {
            textWriter.write(build.getHeaders() + "\n");
            textWriter.write(build.toCSV() + "\n");
        }
        textWriter.flush();
    }

    public static void readFromFile(String file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String string;
            while ((string = reader.readLine()) != null) {
                System.out.println(string);
            }
        }
    }

    public String toString() {
        return textWriter.toString();
    }

}