public class Chef {
    private String name;
    private Pizza pizza;

    public Chef(String name){
        this.name = name;
    }

    public void makePizza(String type){
        this.pizza = new Pizza(type);
    }

    public void sellPizza(){
        System.out.println("The chef " + name + " is selling a delicious " + pizza.type + " pizza");
    }
}
