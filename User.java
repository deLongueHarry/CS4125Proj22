
import java.time.LocalDate;

public class User {
    // Factory method for User
    public static User create(int userID, String username, LocalDate startDate, LocalDate endDate, LocalDate DOB,
            String userType) {
        return new User(userID, username, startDate, endDate, DOB, userType);
    }

    private int userID;
    private String username;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate DOB;
    private String UserType;

    private User(int userID, String username, LocalDate startDate, LocalDate endDate, LocalDate DOB, String userType) {
        this.userID = userID;
        this.username = username;
        this.startDate = startDate;
        this.endDate = endDate;
        this.UserType = userType;
        this.DOB = DOB;
    }

    // userID
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    // StartDate
    public LocalDate getstartDate() {
        return startDate;
    }

    public void setstartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    // EndDate
    public LocalDate getendDate() {
        return endDate;
    }

    public void setendDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // DoB
    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    // UserType

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getUserName() {
        return username;

    }

    public void setUserName(String username) {

        this.username = username;

    }
}
