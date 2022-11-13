package USER.Decorator;

public class BasicMembership implements TierMembership {

    Benefit[] TierBenefits;
    String name;

    @Override
    public void makeTier() {
        this.TierBenefits = new Benefit[5];
        this.setBenefits();

    }

    public String getTierName() {

        return this.name;
    }

    public String toString() {
        return null;
    }

    @Override
    public void setBenefits() {

    }

    @Override
    public void addBenefits() {

    }

}
