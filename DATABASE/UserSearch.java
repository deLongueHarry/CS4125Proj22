// Author - Oliver Nagy

package DATABASE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class UserSearch {

    private static Scanner x;
    public static boolean found;
    public static String ID;
    public static String UserName;
    public static String startDate;
    public static String endDate;
    public static String DOB;
    public static String userType;

    public static void Search(String Filename, String username) throws FileNotFoundException, IOException {

        String file = Filename + ".csv";
        String tempUsername = "";
        String tempID = "";
        String tempDOB = "";
        String tempStart = "";
        String tempEnd = "";
        String tempUserType = "";

        found = false;

        try {
            x = new Scanner(new File(file));

            x.useDelimiter("[,\n]");

            while (x.hasNext() && !found) {

                tempID = x.next();
                tempUsername = x.next();

                tempDOB = x.next();

                tempStart = x.next();
                tempEnd = x.next();
                tempUserType = x.next();

                if (tempID.equals(username.trim())) {
                    found = true;
                    ID = tempID;
                    UserName = tempUsername;
                    DOB = tempDOB;
                    startDate = tempStart;
                    endDate = tempEnd;
                    userType = tempUserType;

                }
            }
            x.close();

        } catch (Exception e) {
            System.out.println("User Search Error");

        }
    }
}
