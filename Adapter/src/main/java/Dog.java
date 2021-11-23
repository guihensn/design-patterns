public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void askAgeBark(){
        dogBark("Woauf ?");
    }
    public void commentAgeBark(){
        dogBark("Woof!");
    }

    public void askNameBark(){
        dogBark("Woof wo ?");
    }

    public void commentNameBark(){
        dogBark("Wo!");
    }

    public String barkName(){
        dogBark("Woof woof.");
        return this.name;
    }

    public int barkAge(){
        dogBark("Woof woof woof.");
        return this.age;
    }

    public void dogBark(String string){
        System.out.println(name + ": " + string);
    }
}
