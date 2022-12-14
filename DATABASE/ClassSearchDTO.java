// Athour - Oliver Nagy
/* This class is used the retrive classes within our database (.csv file)
 * 
 * 
 */
package DATABASE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassSearchDTO {

    private static Scanner x;
    public static String BookingID;
    public static String BookingName;
    public static String Price;
    public static String Location;
    public static boolean finished;

    public static ArrayList<String> Class;

    public static void Search(String Filename) throws FileNotFoundException, IOException {
        finished = false;
        String file = "DATABASE" + "/" + Filename + ".csv";
        String tempID = "";
        String tempName = "";
        String tempPrice = "";
        String tempLoc = "";

        try {
            x = new Scanner(new File(file));
            Class = new ArrayList<String>();

            x.useDelimiter("[,\n]");

            while (x.hasNext()) {

                tempID = x.next();
                tempName = x.next();
                tempPrice = x.next();
                tempLoc = x.next();
                BookingID = tempID;
                BookingName = tempName;
                Price = tempPrice;
                Location = tempLoc;
                Class.add("Class Name: " + BookingName + "  Class ID : " + BookingID
                        + "  Price: " + Price + "  Location: " + Location);

            }

            finished = true;
            x.close();

        } catch (Exception e) {
            System.out.println("Class Cannot be Retrived");

        }
    }
}