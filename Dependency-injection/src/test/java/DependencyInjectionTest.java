public class DependencyInjectionTest {
    public static void main(String args[]){
        Pizza pizza1 = new Pizza("Pepperoni");
        Pizza pizza2 = new Pizza("Chicken");

        //Injection by constructor.
        Client client1 = new Client("Fernanda",pizza1);
        client1.eatPizza();

        //Injection by setter.
        Client client2 = new Client("Jon");
        client2.setPizza(pizza2);
        client2.eatPizza();

        //There is no injection here, the chef makes his own pizza.
        Chef chef = new Chef("Jonathan");
        chef.makePizza("Cheese");
        chef.sellPizza();
    }
}
