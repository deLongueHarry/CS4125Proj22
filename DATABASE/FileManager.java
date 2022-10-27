
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

    public void addBookings(int uniqueNum, String username, boolean addAllServices, boolean addAllHotel,
            boolean addAllToubs,
            boolean addWawTour, boolean addGiants, boolean addCliffs,
            boolean addWifi, boolean addGym, boolean addPool, boolean addHammam) {
        try {
            fich = new PrintWriter(new BufferedWriter(new FileWriter("filesRequired/services.csv", true)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        fich.print(uniqueNum + ","
                + username + ","
                + addAllServices + ","
                + addAllHotel + ","
                + addAllToubs + ","
                + addWawTour + ","
                + addGiants + ","
                + addCliffs + ","
                + addWifi + ","
                + addPool + ","
                + addGym + ","
                + addHammam);

        fich.println("");

        fich.close();
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

    public void addMember(String username, String password, String fibstname, String surname, String email,
            String phone, boolean alertDiscount) {

        try {
            fich = new PrintWriter(new BufferedWriter(new FileWriter("filesRequired/member.csv", true)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        fich.print(username + ","
                + password + ","
                + fibstname + ","
                + surname + ","
                + email + ","
                + phone + "," + alertDiscount);

        fich.println("");

        fich.close();

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

    public void writeReservation(String username, String location, String roomType, String nbOfGuest,
            LocalDate dateArrival, int numberOfNights, int uniqueNumber) {
        DateTimeFormatter dateToString = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String arrivalDate = dateArrival.format(dateToString);

        try {
            fich = new PrintWriter(new BufferedWriter(new FileWriter("filesRequired/reservations.csv", true)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        fich.print(username + ","
                + location + ","
                + roomType + ","
                + nbOfGuest + ","
                + arrivalDate + ","
                + numberOfNights + ","
                + uniqueNumber);

        fich.println("");

        fich.close();

    }

    public void initializeReservations(BookingSystem bs) {
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

            bs.makeBoooking(username, checkIn, checkOut, location, roomType, nbOfGuests, uniqueReservationNumber);

        }

    }

    public ArrayList<String> getReservation() {
        ArrayList<String> Reservations = new ArrayList<String>();
        FileReader readFile = null;
        BufferedReader buffer = null;
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
            Reservations.add(line);
        }
        return Reservations;
    }

   
    

    public void cancelBooking(String reservationNumber) {
        try {
            readFile = new FileReader("filesRequired/reservations.csv");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        buffer = new BufferedReader(readFile);
        String line = null;

        try {
            fich = new PrintWriter(new BufferedWriter(new FileWriter("filesRequired/ficBuffer.csv", true)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while (true) {

            try {
                line = buffer.readLine();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (line == null) {
                fich.close();
                try {
                    buffer.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                try (FileChannel bufferFic = new FileInputStream("filesRequired/ficBuffer.csv").getChannel();
                        FileChannel realFic = new FileOutputStream("filesRequired/reservations.csv").getChannel()) {
                    bufferFic.transferTo(0, bufferFic.size(), realFic);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;

            }
            String[] parts = line.split(",");

            if (!parts[6].equals(reservationNumber)) {
                String s = String.join(",", parts);
                fich.println(s);

            }

        }
    }

    public boolean isDetailsSaved(String username) {
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
                return false;
            }
            String[] parts = line.split(",");
            if (username.equals(parts[0])) {
                return true;

            }

        }
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
