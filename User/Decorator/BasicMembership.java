package USER.Decorator;

public class BasicMembership implements TierMembership {

    Benefit[] TierBenefits;
    String name;

    @Override
    public void makeTier(String n) {
        this.name = n;

    }

    public String getTierName() {

        return name;
    }

    public String toString() {
        return null;
    }

    @Override
    public void setBenefits() {
        TierBenefits = new Benefit[5];
        TierBenefits[1].setBenefitName("Pool");
        TierBenefits[2].setBenefitName("Running Track");
        TierBenefits[3].setBenefitName("Sauna");
        TierBenefits[4].setBenefitName("Yoga");
        TierBenefits[5].setBenefitName("Gym");

        TierBenefits[1].setBenefitValue(false);
        TierBenefits[2].setBenefitValue(false);
        TierBenefits[3].setBenefitValue(false);
        TierBenefits[4].setBenefitValue(false);
        TierBenefits[5].setBenefitValue(true);
    }

    @Override
    public void addBenefits() {

    }

}
