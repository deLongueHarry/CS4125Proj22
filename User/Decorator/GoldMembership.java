// Author - Oliver Nagy
/* Concrete Decorator
 * 
 * 
 */
package User.Decorator;

public class GoldMembership extends TierDecorator {

    public GoldMembership(TierMembership tier, String name) {
        super(tier, name);
    }

    public void makeTier() {
        super.makeTier();
        setBenefits();
        addBenefits();

    }

    public void setBenefits() {
        this.tierBenefits[0] = new Benefit("Gym", true);
        this.tierBenefits[1] = new Benefit("Pool", false);
        this.tierBenefits[2] = new Benefit("Sauna", false);
        this.tierBenefits[3] = new Benefit("Yoga", false);
        this.tierBenefits[4] = new Benefit("Wall Climbing", false);

    }

    public void addBenefits() {
        tierBenefits[2].setBenefitValue(true);
    }
}
