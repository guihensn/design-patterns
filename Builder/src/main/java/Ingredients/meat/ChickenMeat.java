package Ingredients.meat;

public class ChickenMeat extends Meat{
    private boolean freeRangeChicken;

    public ChickenMeat(float price, float weight, boolean freeRangeChicken) {
        super(price, weight);
        this.freeRangeChicken = freeRangeChicken;
    }

    @Override
    public String toString() {
        return "ChickenMeat{" +
                "freeRangeChicken=" + freeRangeChicken +
                '}';
    }
}
