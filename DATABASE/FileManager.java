
package DATABASE;

import BOOKINGSYSTEM.BookingSystem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for writing details to files
 * 
 */
public class FileManager {

    // Factory method for FileManager
    public static FileManager create() {
        return new FileManager();
    }

    FileReader readFile = null;

    BufferedReader buffer = null;

    FileWriter writeFile = null;

    BufferedWriter out = null;

    PrintWriter fich = null;

    private FileManager() {

    }

    public void addBookings() {

    }

    public boolean isMember(String username, String password) {
        try {
            readFile = new FileReader("filesRequired/member.csv");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        buffer = new BufferedReader(readFile);
        String line = null;

        while (true) {

            try {
                line = buffer.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (line == null) {
                return false;
            }
            String[] parts = line.split(",");

            if ((username.equals(parts[0])) && (password.equals(parts[1]))) {
                return true;

            }

        }
    }

    public void addMember() {

    }

    public void addCreditCardDetails(String username, String nameOnCard, String cardNumber, String expiryDate,
            String CV2Num) {

        try {
            fich = new PrintWriter(new BufferedWriter(new FileWriter("filesRequired/CardDetails.csv", true)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        fich.print(username + "," +
                nameOnCard + ","
                + cardNumber + ","
                + expiryDate + ","
                + CV2Num);

        fich.println("");

        fich.close();

    }

    public void wrtieBoooking() {

    }

    public void initializeBoooking(BookingSystem bs) {
        try {
            readFile = new FileReader("filesRequired/reservations.csv");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        buffer = new BufferedReader(readFile);
        String line = null;

        while (true) {

            try {
                line = buffer.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (line == null) {
                break;
            }
            String[] parts = line.split(",");
            String username = parts[0];
            String location = parts[1];
            String roomType = parts[2];
            String nbOfGuests = parts[3];
            LocalDate checkIn = LocalDate.parse(parts[4],
                    DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT));
            LocalDate checkOut = checkIn.plusDays(Integer.parseInt(parts[5]));
            int uniqueReservationNumber = Integer.parseInt(parts[6]);
            DateTimeFormatter dateToString = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String arrivalDate = checkOut.format(dateToString);

            // bs.makeBooking()

        }

    }

    public ArrayList<String> getReservation() {
        return null;
    }

    public void cancelBooking() {

    }

    public boolean isDetailsSaved() {
        return false;
    }

    public ArrayList<String> getCardDetails() {
        ArrayList<String> CardDetails = new ArrayList<String>();
        FileReader readFile = null;
        BufferedReader buffer = null;
        try {
            readFile = new FileReader("filesRequired/CardDetails.csv");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        buffer = new BufferedReader(readFile);
        String line = null;
        while (true) {
            try {
                line = buffer.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line == null) {
                break;
            }
            String[] parts = line.split(",");

            for (int i = 0; i < 5; i++) {
                CardDetails.add(parts[i]);
            }
        }
        return CardDetails;
    }
}
