package DATABASE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void Write(String[][] Data, String name) throws IOException {

        File csvFile = new File(name + ".csv");
        FileWriter fileWriter = new FileWriter(csvFile, true);

        // write header line here if you need.

        for (String[] data : Data) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                line.append("\"");
                line.append(data[i].replaceAll("\"", "\"\""));
                line.append("\"");
                if (i != data.length - 1) {
                    line.append(',');
                }
            }
            line.append("\n");
            fileWriter.write(line.toString());
        }
        fileWriter.close();
    }
}