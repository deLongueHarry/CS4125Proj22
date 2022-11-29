// This class is used to create "Classes" e.g Yoga Class
package BOOKINGSYSTEM;

public class Class {
    private String bookingNum;
    private String price;
    private String className;
    private String location;

    public Class(String bookingNum, String className, String price, String location) {

        this.className = className;

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
        return className;
    }

    public void setClassType(String className) {
        this.className = className;
    }

}