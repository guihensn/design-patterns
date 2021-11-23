public class PersonAdaptor implements Person {
    private Dog dog;

    public PersonAdaptor(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void talkToSomeone(Person person) {
        AskAge();
        comentAboutAge(person);
        AskName();
        comentAboutName(person);
    }

    @Override
    public void AskName() {
         dog.askNameBark();
         translatorSay("What is your name ?");
    }

    @Override
    public void comentAboutName(Person person) {
        String name = person.sayName();
        dog.commentNameBark();
        translatorSay(name +" is a good name!");
    }

    @Override
    public void AskAge() {
        dog.askAgeBark();
        translatorSay("How old are you ?");
    }

    @Override
    public void comentAboutAge(Person person) {
        int age = person.sayAge();
        dog.commentAgeBark();
        translatorSay("Wow, you are " + age + " years old!");
    }


    @Override
    public String sayName() {
        String name = dog.barkName();
        translatorSay("I am " + name + ".");
        return name;
    }

    @Override
    public int sayAge() {
        int age = dog.barkAge();
        translatorSay("I am " + age + ".");
        return age;
    }

    public void translatorSay(String string){
        System.out.println("Translator: " + string);
    }
}
