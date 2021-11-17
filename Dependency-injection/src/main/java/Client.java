public class Client {
    private String name;
    private Pizza pizza;

    public Client(String name){
        this.name = name;
    }

    public Client(String name, Pizza pizza) {
        this.name = name;
        this.pizza = pizza;
    }

    public void eatPizza(){
        System.out.println(name + " is eating a delicious " + pizza.type + " pizza");
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
