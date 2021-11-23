public class BuilderTest {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Director director = new Director(pizzaBuilder);


        String pizzaSize = "large";
        director.makePepperoniPizza(pizzaSize);
        Pizza largePepperoniPizza = pizzaBuilder.getPizza();
        System.out.println(largePepperoniPizza);

        pizzaSize = "small";
        director.makeChickenPizza(pizzaSize);
        Pizza smallChickenPizza = pizzaBuilder.getPizza();
        System.out.println(smallChickenPizza);

        pizzaSize = "default";
        director.makeNeapolitanPizza(pizzaSize);
        Pizza defaultNeapolitanPizza = pizzaBuilder.getPizza();
        System.out.println(defaultNeapolitanPizza);
    }
}
