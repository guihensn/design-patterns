import Ingredients.Pasta;
import Ingredients.Sauce;
import Ingredients.Tomato;
import Ingredients.meat.ChickenMeat;
import Ingredients.meat.PepperoniMeat;

public class PizzaBuilder implements Builder {
    private float size;
    private Pizza pizza;

    public PizzaBuilder(){
        this.pizza = new Pizza();
    }

    public void setSize(String pizzaSize){
        switch (pizzaSize){
            case "small":
                this.size = 1;
                break;
            case "default":
                this.size = 1.5f;
                break;
            case "large":
                this.size = 2;
                break;
        }

        this.setPasta();
    }

    private void setPasta(){
        float radius = 10 * this.size;
        float thickness = 1 * this.size;

        Pasta pasta = new Pasta(radius , thickness);

        this.pizza.setPasta(pasta);
    }

    public void setPepperoniMeat(boolean smoked){
        float price = 2.00f * this.size;
        float weight = 3.00f * this.size;

        PepperoniMeat pepperoni = new PepperoniMeat(price, weight, smoked);

        this.pizza.setMeat(pepperoni);
    }

    public void setChickenMeat(boolean freeRangeChicken){
        float price = 1.45f * this.size;
        float weight = 2.14f * this.size;

        ChickenMeat pepperoni = new ChickenMeat(price, weight, freeRangeChicken);

        this.pizza.setMeat(pepperoni);
    }

    public void setTomato(boolean cherryTomato){
        float weight = 0.75f * this.size;

        Tomato tomato = new Tomato(cherryTomato, weight);

        this.pizza.setTomato(tomato);
    }

    public void setSauce(String type){
        Sauce sauce = new Sauce(type);

        this.pizza.setSauce(sauce);
    }

    public Pizza getPizza(){
        Pizza readyPizza = this.pizza;
        this.reset();
        return readyPizza;
    }

    public void reset(){
        this.pizza = new Pizza();
    }
}
