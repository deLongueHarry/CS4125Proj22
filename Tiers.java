import java.util.LinkedList;

public class Tiers extends Tier {

    LinkedList<Tier> Tiers;

    public Tiers() {
        Tiers = new LinkedList<Tier>();
    }

    public void addTier(String name) {
        Tier t = new Tier();
        t.setTierName(name);
        Tiers.add(t);

    }

    public LinkedList<Tier> getTiers() {

        return Tiers;

    }

}