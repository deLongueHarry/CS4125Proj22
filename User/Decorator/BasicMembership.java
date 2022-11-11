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

        this.TierBenefits[0] = new Benefit("Gym", true);
        this.TierBenefits[1] = new Benefit("Pool", false);
        this.TierBenefits[2] = new Benefit("Sauna", false);
        this.TierBenefits[3] = new Benefit("Yoga", false);
        this.TierBenefits[4] = new Benefit("Wall Climbing", false);
    }

    @Override
    public void addBenefits() {

    }

}
