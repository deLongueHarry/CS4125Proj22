package USER.Decorator;

public interface TierMembership {

    Benefit[] TierBenefits = null;
    String name = null;

    public void makeTier(String n);

    public void addBenefits();

    public void setBenefits();

    public String getTierName();

    public String toString();
}
