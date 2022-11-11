package USER.Decorator;

public class BasicMembership implements TierMembership {

    Benefit[] TierBenefits;
    String name;

    @Override
    public void makeTier() {
        TierBenefits = new Benefit[5];
        setBenefits();

    }

    public String getTierName() {

        return name;
    }

    public String toString() {
        return null;
    }

    @Override
    public void setBenefits() {

        TierBenefits[0] = new Benefit("Gym", true);
        TierBenefits[1] = new Benefit("Pool", false);
        TierBenefits[2] = new Benefit("Sauna", false);
        TierBenefits[3] = new Benefit("Yoga", false);
        TierBenefits[4] = new Benefit("Wall Climbing", false);
    }

    @Override
    public void addBenefits() {

    }

}
