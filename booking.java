
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Booking {
    public static Booking create(int BookingNum, ArrayList<String> usernames, LocalDateTime startTime,
            LocalDateTime endTime) {
        return new Booking(BookingNum, usernames, startTime, endTime);
    }

    private int BookingNum;
    ArrayList<String> usernames = new ArrayList<String>();
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double price;
    private int capacity;
    private String BookingType;
    private String location;

    private Booking(int BookingNum, ArrayList<String> usernames, LocalDateTime startTime2, LocalDateTime endTime2) {
        this.BookingNum = BookingNum;
        // this.username = userBooked
        this.startTime = startTime2;
        this.endTime = endTime2;
    }

    public int getBookingNum() {
        return BookingNum;
    }

    public void setBookingNum(int BookingNum) {
        this.BookingNum = BookingNum;
    }

    public ArrayList<String> getUsernames() {
        // Search database for users with this booking number ---- private int
        // BookingNum;

        return null;
    }

    // public void addUser { }

    public LocalDateTime getstartTime() {
        return startTime;
    }

    public void setstartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getendTime() {
        return endTime;
    }

    public void setendTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        this.price = Price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int Capacity) {
        this.capacity = Capacity;
    }

    public String getBookingType() {
        return BookingType;
    }

    public void setBookingType(String BookingType) {
        this.BookingType = BookingType;
    }

    public String getLocation() {
        return location;

    }

    public void setLocation(String location) {

        this.location = location;

    }

}