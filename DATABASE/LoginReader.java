package DATABASE;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginReader {
    public boolean found = false;

    public void Read(String name, String password, String userName) throws FileNotFoundException, IOException {

        String file = name + ".csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                if (line.contains(userName) && line.contains(password)) {
                    found = true;

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
