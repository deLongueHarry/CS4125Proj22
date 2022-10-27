package USER;

public class Member extends User {

    LinkedList<Booking> Bookings = new LinkedList<Booking>();
    public Tier Tier;

    public Member(LinkedList<Booking> Bookings,Tier tier) {

        
        super(userID, username, startDate, endDate, DOB, userType);

    }

}
