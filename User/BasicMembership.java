package USER;

public class BasicMembership implements TierMembership {

    @Override
    public String makeTier() {
        return "Membership made";
    }

}
