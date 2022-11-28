// Author - Oliver Nagy

package DATABASE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDTO {

    public void Write(String[][] Data, String name) throws IOException {

        File csvFile = new File("DATABASE" + "/" + name + ".csv");
        FileWriter fileWriter = new FileWriter(csvFile, true);

        for (String[] data : Data) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                line.append("");
                line.append(data[i].replaceAll("", ""));
                line.append("");
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