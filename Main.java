import USER.Decorator.BasicMembership;
import USER.Decorator.SilverMemberShip;
import USER.Decorator.TierMembership;

public class Main {

    public static void main(String[] args) {
        // test
        TierMembership SilverTier = new SilverMemberShip(new BasicMembership(), "Silver Tier");
        SilverTier.makeTier();

    }

}