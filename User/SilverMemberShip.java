package USER;

public class SilverMemberShip extends TierDecorator {

    public SilverMemberShip(TierMembership tier) {
        super(tier);
    }

    public String makeTier() {
        return tier.makeTier() + addBenefitsSilver();
    }

    private String addBenefitsSilver() {
        return "Silver Memberhip benefits added";
    }

}