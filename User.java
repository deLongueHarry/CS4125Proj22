package User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class User {
    // Factory method for User
    public static User create(int userid, String username, LocalDate startDate, LocalDate endDate, LocalDate DOB) {
        return new UserID, username, startDate, endDate);
    }

    private int UserID;
    private String username;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate DOB;
    private String UserType;

    private User(int UserID, String username, LocalDateTime startDate, LocalDateTime endDate, LocalDate DOB;) {
        this.UserID = UserID;
       this.username = username;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int get

    UserID() {
        return UserID;
    }

    public void set

    UserID(int UserID) {
        this UserID = UserID;
    }

    public LocalDate getstartDate() {
        return startDate;
    }

    public void setstartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getendDate() {
        return endDate;
    }

    public void setendDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(double DOB) {
        this.DOB = DOB;
    }

    public String get

    UserType() {
        return UserType;
    }

    public void set

    UserType(String UserType) {
        this UserType = UserType;
    }

}
