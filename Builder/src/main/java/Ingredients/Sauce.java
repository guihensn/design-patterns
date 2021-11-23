package Ingredients;

public class Sauce {
    public String type;

    public Sauce(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ingredients.Sauce{" +
                "type='" + type + '\'' +
                '}';
    }
}
