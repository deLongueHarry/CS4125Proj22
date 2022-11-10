package USER;

public class GoldMembership extends TierDecorator {

    public GoldMembership(TierMembership tier, Boolean tierBenefits[]) {
        super(tier, tierBenefits);
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
