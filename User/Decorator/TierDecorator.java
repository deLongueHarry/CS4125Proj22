package USER.Decorator;

public class TierDecorator implements TierMembership {

    protected TierMembership tier;
    protected Benefit tierBenefits[];
    protected String name;

    public TierDecorator(TierMembership tier, String name) {
        this.tier = tier;
        tierBenefits = new Benefit[5];
        this.name = name;
    }

    @Override
    public void makeTier(String n) {
        tier.makeTier(n);

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

        tierBenefits[0].setBenefitName("Pool");
        tierBenefits[1].setBenefitName("Running Track");
        tierBenefits[2].setBenefitName("Sauna");
        tierBenefits[3].setBenefitName("Yoga");
        tierBenefits[4].setBenefitName("Gym");

        tierBenefits[0].setBenefitValue(false);
        tierBenefits[1].setBenefitValue(false);
        tierBenefits[2].setBenefitValue(false);
        tierBenefits[3].setBenefitValue(false);
        tierBenefits[4].setBenefitValue(true);

    }

}
