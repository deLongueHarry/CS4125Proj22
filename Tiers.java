import java.util.LinkedList;

public class Tiers {

    LinkedList<Tier> Tiers;
    Tier t;

    public Tiers() {
        Tiers = new LinkedList<Tier>();
    }

    public void addTier(String name) {
        t = new Tier(name);
        t.setTierName(name);
        Tiers.add(t);

    }

    public LinkedList<Tier> getTiers() {

        return Tiers;

    }

}