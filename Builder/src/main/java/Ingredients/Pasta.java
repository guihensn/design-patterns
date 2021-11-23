package Ingredients;

public class Pasta {
    public float thickness;
    public float radius;

    public Pasta(float thickness, float radius) {
        this.thickness = thickness;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ingredients.Pasta{" +
                "thickness=" + thickness +
                ", radius=" + radius +
                '}';
    }
}
