public class PersonImpl implements Person {
    private String name;
    private int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void talkToSomeone(Person person) {
        AskAge();
        comentAboutAge(person);
        AskName();
        comentAboutName(person);
    }

    @Override
    public void AskAge(){
        say("How old are you ?");
    }

    @Override
    public void comentAboutAge(Person person) {
        int age = person.sayAge();
        say("Wow, you are " + age + " years old!");
    }

    @Override
    public void AskName(){
        say("What is your name ?");

    }

    @Override
    public void comentAboutName(Person person) {
        String name = person.sayName();
        say( name + " is a nice name!");
    }

    public String sayName() {
        say("My name is " + name + ".");
        return name;
    }

    public int sayAge() {
        say("I am " + this.age + " years old.");
        return age;
    }

    public void say(String phrase){
        System.out.println(this.name +": " + phrase);
    }
}
