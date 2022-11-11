package USER.Decorator;

;

public class SilverMemberShip extends TierDecorator {

    public SilverMemberShip(TierMembership tier, String name) {
        super(tier, name);
    }

    public void makeTier() {
        String name = "Silver Membership";
        tier.makeTier(name);
        tier.getTierName();
        addBenefits();

    }

    public void addBenefits() {
        TierBenefits[1].setBenefitValue(true);
    }

    public String toString() {

        return null;

    }

}