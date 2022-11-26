// Athour - Oliver Nagy
package DATABASE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class ClassSearchDTO {

    private static Scanner x;
    public static String BookingID;
    public static String BookingName;
    public static String Price;
    public static String Location;
    public static boolean finished;
    public static String[] Class;

    public static void Search(String Filename) throws FileNotFoundException, IOException {
        finished = false;
        String file = Filename + ".csv";
        String tempID = "";
        String tempName = "";
        String tempPrice = "";
        String tempLoc = "";

        try {
            x = new Scanner(new File(file));
            Class = new String[100];

            x.useDelimiter("[,\n]");

            for (int i = 0; x.hasNext(); i++) {

                tempID = x.next();
                tempName = x.next();
                tempPrice = x.next();
                tempLoc = x.next();
                BookingID = tempID;
                BookingName = tempName;
                Price = tempPrice;
                Location = tempLoc;
                Class[i] = "Class Name: " + BookingName + "  Class ID : " + BookingID
                        + "  Price: " + Price + "  Location: " + Location;

            }

            finished = true;
            x.close();

        } catch (Exception e) {
            System.out.println("Class Cannot be Retrived");

        }
    }
}