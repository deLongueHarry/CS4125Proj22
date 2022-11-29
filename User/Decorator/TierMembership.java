// Author - Oliver Nagy

/* Interface for the Decorator
 * 
 * 
 */

package User.Decorator;

public interface TierMembership {

    Benefit[] TierBenefits = null;

    public void makeTier();

    public void addBenefits();

    public void setBenefits();

    public String getTierName();

}
