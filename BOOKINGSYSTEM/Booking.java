package BOOKINGSYSTEM;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Booking {
    public static Booking create(String classType, LocalDateTime startTime, LocalDateTime endTime, String price,
            String location,
            String bookingNum) {
        // return new Booking(classType, startTime, endTime, price, location,
        // bookingNum);
        return new Booking(classType, startTime, endTime, price, location, bookingNum);
    }

    private String bookingNum;
    private String price;
    private String classType;
    private String location;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Booking(String classType, LocalDateTime startTime, LocalDateTime endTime, String price, String location,
            String bookingNum) {

        this.classType = classType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.location = location;
        this.bookingNum = bookingNum;

    }

    public String getBookingNum() {
        return bookingNum;
    }

    public void setBookingNum(String bookingNum) {
        this.bookingNum = bookingNum;
    }

    public ArrayList<String> getUsernames() {
        // Search database for users with this booking number ---- private int
        // BookingNum;

        return null;
    }

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String Price) {
        this.price = Price;
    }

    public String getLocation() {
        return location;

    }

    public void setLocation(String location) {

        this.location = location;

    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

}