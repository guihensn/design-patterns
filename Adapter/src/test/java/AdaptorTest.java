public class AdaptorTest {
    public static void main(String[] args) {
        Person person1 = new PersonImpl("Helio",24);
        Person person2 = new PersonImpl("Camila",37);

        Dog dog = new Dog("Bob", 5);
        PersonAdaptor personAdaptor = new PersonAdaptor(dog);

        title("---Helio and camila dialog---");
        person1.talkToSomeone(person2);

        title("---Helio and bob dialog---");
        person1.talkToSomeone(personAdaptor);

        title("---Bob and Camila dialog---");
        personAdaptor.talkToSomeone(person2);
    }

    public static void title(String title){
        System.out.println("\n--------------------------"+title+"---------------------------\n");
    };

}
