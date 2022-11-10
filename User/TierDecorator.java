package USER;

public class TierDecorator implements TierMembership {

    protected TierMembership tier;

    public TierDecorator(TierMembership tier) {
        this.tier = tier;
    }

    @Override
    public String makeTier() {
        return tier.makeTier();
    }

}
