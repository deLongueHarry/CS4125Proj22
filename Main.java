import USER.Decorator.BasicMembership;
import USER.Decorator.GoldMembership;
import USER.Decorator.SilverMemberShip;
import USER.Decorator.TierMembership;

public class Main {

    public static void main(String[] args) {

        TierMembership test = new SilverMemberShip(new BasicMembership(), "Silver");

        test.toString();

    }

}