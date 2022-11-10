package USER;

public interface TierMembership {

    Benefit[] TierBenefits = new Benefit[5];
    String name = "";

    public void makeTier(String n);

    public void addBenefits();

    public String getTierName();
}
