// Author - Oliver Nagy
/* This class is used the verify login details provided by the user 
 * 
 * 
 */
package DATABASE;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Scanner;

public class VerifyLoginDTO {
    private static Scanner x;
    public boolean found;

    public void Verify(String Filename, String password, String username) throws FileNotFoundException, IOException {

        String file = "DATABASE" + "/" + Filename + ".csv";
        String tempUsername = "";
        String tempPassword = "";
        found = false;

        try {
            x = new Scanner(new File(file));
            x.useDelimiter("[,\n]");
            while (x.hasNext() && !found) {
                tempUsername = x.next();
                tempPassword = x.next();
                if (tempUsername.equals(username.trim()) && tempPassword.trim().equals(password.trim())) {
                    found = true;
                }
            }
            x.close();

        } catch (Exception e) {
            System.out.println("Login Error");

        }
    }
}
