package USER;

public class Member extends User {

    LinkedList<Booking> Bookings = new LinkedList<Booking>();
    public Tiers Tiers;
    public String memberTier;

    public Member(LinkedList<Booking> Bookings,String memberTier) {

        
        super(userID, username, startDate, endDate, DOB, userType);

    }

    public void setMemberTier(String name){

        Tiers t = Tiers.getTiers();

            int i=t.indexOf(name);

            memberTier = t(i.getTierName());
           }

        

    

    public String getMemberTier(){
      return memberTier;

    }

}
