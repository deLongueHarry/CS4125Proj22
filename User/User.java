package USER;

import java.time.LocalDate;

public class User {
    // Factory method for User
    public static User create(String userID, String username, LocalDate startDate, LocalDate endDate, LocalDate DOB,
            String userType) {
        return new User(userID, username, startDate, endDate, DOB, userType);
    }

    protected static String userID;
    protected static String username;
    protected static LocalDate startDate;
    protected static LocalDate endDate;
    protected static LocalDate DOB;
    protected static String userType;

    public User(String userID, String username, LocalDate startDate, LocalDate endDate, LocalDate DOB,
            String userType) {
        User.userID = userID;
        User.username = username;
        User.startDate = startDate;
        User.endDate = endDate;
        User.userType = userType;
        User.DOB = DOB;
    }

    // userID
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        User.userID = userID;
    }

    // StartDate
    public LocalDate getstartDate() {
        return startDate;
    }

    public void setstartDate(LocalDate startDate) {
        User.startDate = startDate;
    }

    // EndDate
    public LocalDate getendDate() {
        return endDate;
    }

    public void setendDate(LocalDate endDate) {
        User.endDate = endDate;
    }

    // DoB
    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        User.DOB = DOB;
    }

    // UserType

    public String getUserType() {
        return userType;
    }

    public void setUserType(String UserType) {
        User.userType = UserType;
    }

    public String getUserName() {
        return username;

    }

    public void setUserName(String username) {

        User.username = username;

    }
}
