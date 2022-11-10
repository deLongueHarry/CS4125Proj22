package USER;

public class GoldMembership extends TierDecorator {

    public GoldMembership(TierMembership tier, Boolean tierBenefits[], String name) {
        super(tier, tierBenefits, name);
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
