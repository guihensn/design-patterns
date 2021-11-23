package Ingredients;

public class Tomato {
    private boolean cherryTomato;
    private float weight;

    public Tomato(boolean cherryTomato, float weight) {
        this.cherryTomato = cherryTomato;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ingredients.Tomato{" +
                "cherryTomato=" + cherryTomato +
                ", weight=" + weight +
                '}';
    }
}
