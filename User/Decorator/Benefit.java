package USER.Decorator;

public class Benefit {

    public String name;
    public boolean value;

    public Benefit(String n, boolean v) {
        this.name = n;
        this.value = v;

    }

    public void setBenefitName(String n) {

        this.name = n;
    }

    public void setBenefitValue(boolean v) {

        this.value = v;
    }

    public String getBenefitName() {

        return name;
    }

    public boolean getBenefitValue() {

        return value;
    }

}
