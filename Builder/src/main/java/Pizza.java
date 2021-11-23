import Ingredients.Pasta;
import Ingredients.Sauce;
import Ingredients.Tomato;
import Ingredients.meat.Meat;

import java.util.ArrayList;

public class Pizza {
    private Pasta pasta;
    private Tomato tomato;
    private Sauce sauce;
    private ArrayList<Meat> meats = new ArrayList<>();


    public void setPasta(Pasta pasta) {
        this.pasta = pasta;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setMeat(Meat meat) {
        this.meats.add(meat);
    }

    @Override
    public String toString() {
        return "\nPizza" +
                "\n  " + pasta +
                "\n  " + tomato +
                "\n  " + sauce +
                "\n  " + meats;
    }
}
