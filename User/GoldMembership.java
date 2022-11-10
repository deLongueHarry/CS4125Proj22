package USER;

public class GoldMembership extends TierDecorator {

    public GoldMembership(TierMembership tier) {
        super(tier);
    }

    public String makeTier() {
        return tier.makeTier() + addBenefitsGold();
    }

    private String addBenefitsGold() {
        return "Gold Membership benefits added";
    }
}
