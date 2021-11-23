public class Director {
    private PizzaBuilder pizzaBuilder;

    public Director(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public void makePepperoniPizza(String size){
        this.pizzaBuilder.setSize(size);
        this.pizzaBuilder.setPepperoniMeat(false);
        this.pizzaBuilder.setTomato(false);
        this.pizzaBuilder.setSauce("Ingredients.Tomato sauce");
    }

    public void makeChickenPizza(String size){
        this.pizzaBuilder.setSize(size);
        this.pizzaBuilder.setChickenMeat(false);
        this.pizzaBuilder.setSauce("Gorgonzola sauce");
    }

    public void makeNeapolitanPizza(String size){
        this.pizzaBuilder.setSize(size);
        this.pizzaBuilder.setChickenMeat(true);
        this.pizzaBuilder.setPepperoniMeat(true);
        this.pizzaBuilder.setTomato(true);
        this.pizzaBuilder.setSauce("Peanut Ingredients.Sauce");
    }
}
