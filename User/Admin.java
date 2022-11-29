//Admin class 
package USER;

public class Admin extends User {

    public String Role;
    public String PPSN;

    public Admin(String Role, String PPSN) {

        super(userID, username, startDate, endDate, DOB, userType);

    }

}