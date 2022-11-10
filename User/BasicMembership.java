package USER;

public class BasicMembership implements TierMembership {

    Benefit[] TierBenefits = new Benefit[5];
    String name;

    @Override
    public void makeTier(String n) {
        this.name = n;
    }

    public void SetBenefits() {
        TierBenefits[1].setBenefitName("Pool");
        TierBenefits[1].setBenefitValue(false);
        TierBenefits[2].setBenefitName("Running Track");
        TierBenefits[2].setBenefitValue(false);

    }

    @Override
    public void addBenefits() {

    }

    public String getTierName() {

        return name;
    }

}
