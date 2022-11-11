package USER.Decorator;

public class GoldMembership extends TierDecorator {

    public GoldMembership(TierMembership tier, String name) {
        super(tier, name);
    }

    public void makeTier() {
        String name = "Gold Membership";
        tier.makeTier(name);
        tier.getTierName();
        addBenefits();
    }

    public void addBenefits() {
        TierBenefits[2].setBenefitValue(true);
    }

}
