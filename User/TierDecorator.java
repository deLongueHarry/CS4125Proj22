package USER;

public class TierDecorator implements TierMembership {

    protected TierMembership tier;
    protected Boolean tierBenefits[];
    protected String name;

    public TierDecorator(TierMembership tier, Boolean tierBenefits[]) {
        this.tier = tier;
        this.tierBenefits = tierBenefits;
    }

    @Override
    public void makeTier(String n) {
        tier.makeTier(name);
    }

    @Override
    public void addBenefits() {

    }

    @Override
    public String getTierName() {
        return name;
    }

}
