package USER.Decorator;

public interface TierMembership {

    Benefit[] TierBenefits = null;

    public void makeTier();

    public void addBenefits();

    public void setBenefits();

    public String getTierName();

    public String toString();
}
