package ua.lviv.iot.IOmanager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SportBuildWriter {

    private Writer writer;

    public SportBuildWriter(final Writer writer) {
        this.writer = writer;
    }

    public static void inputTextToFile(final String fileName, final String... lines) throws IOException {
        final File file = new File(fileName);
        Writer writer = new FileWriter(file);
        for (String line : lines) {
            writer.write(line);
            writer.write("\r\n");
        }
        writer.flush();

    }

    public static void outputTextOfFile(final String file) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(file));
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public final void inputTextFootballField(final String... lines) throws IOException {
        for (String line : lines) {
            writer.write(line);
            writer.write("\r\n");
        }
        writer.flush();
    }

    public final void inputTextAthleticsField(final String... lines) throws IOException {
        for (String line : lines) {
            writer.write(line);
            writer.write("\r\n");
        }
        writer.flush();
    }

    public final void inputTextSwimmingPool(final String... lines) throws IOException {
        for (String line : lines) {
            writer.write(line);
            writer.write("\r\n");
        }
        writer.flush();
    }


    @Override
    public final String toString() {
        return writer.toString();
    }


}
