package Ingredients.meat;

public class PepperoniMeat extends Meat{
    private boolean smokedSausage;

    public PepperoniMeat(float price, float weight, boolean smokedSausage) {
        super(price, weight);
        this.smokedSausage = smokedSausage;
    }

    @Override
    public String toString() {
        return "PepperoniMeat{" +
                "smokedSausage=" + smokedSausage +
                '}';
    }
}
