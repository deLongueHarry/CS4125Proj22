package USER;

public class SilverMemberShip extends TierDecorator {

    public SilverMemberShip(TierMembership tier, Boolean tierBenefits[]) {
        super(tier, tierBenefits);
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


}