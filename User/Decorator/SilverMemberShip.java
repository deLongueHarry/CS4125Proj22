package USER.Decorator;

;

public class SilverMemberShip extends TierDecorator {

    public SilverMemberShip(TierMembership tier, String name) {
        super(tier, name);
    }

    public void makeTier() {
        super.makeTier();
        addBenefits();

    }

    public void addBenefits() {
        tierBenefits[1].setBenefitValue(true);
    }

    public String toString() {

        return null;

    }

}