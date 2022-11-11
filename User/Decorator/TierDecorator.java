package USER.Decorator;

public class TierDecorator implements TierMembership {

    protected TierMembership tier;
    protected Benefit tierBenefits[];
    protected String name;

    public TierDecorator(TierMembership tier, String name) {
        this.tier = tier;
        this.name = name;
        this.tierBenefits = new Benefit[5];
        this.tier.setBenefits();
    }

    @Override
    public void makeTier() {
        this.tier.makeTier();

    }

    @Override
    public void addBenefits() {

    }

    @Override
    public String getTierName() {
        return name;
    }

    @Override
    public void setBenefits() {

        tierBenefits[0] = new Benefit("Gym", true);
        tierBenefits[1] = new Benefit("Pool", false);
        tierBenefits[2] = new Benefit("Sauna", false);
        tierBenefits[3] = new Benefit("Yoga", false);
        tierBenefits[4] = new Benefit("Wall Climbing", false);

    }

}
