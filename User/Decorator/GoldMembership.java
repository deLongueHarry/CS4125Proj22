package USER.Decorator;

public class GoldMembership extends TierDecorator {

    public GoldMembership(TierMembership tier, String name) {
        super(tier, name);
    }

    public void makeTier() {
        super.makeTier();
        addBenefits();
    }

    public void addBenefits() {
        TierBenefits[2].setBenefitValue(true);
    }

}
