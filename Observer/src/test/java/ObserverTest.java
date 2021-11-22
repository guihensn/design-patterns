public class ObserverTest {
    public static void main(String args[]){
        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new Subscriber("Ana");
        Subscriber subscriber2 = new Subscriber("Matheus");
        Subscriber subscriber3 = new Subscriber("Pedro");

        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        publisher.addSubscriber(subscriber3);

        Magazine magazine1 = new Magazine("The bitcoin");
        Magazine magazine2 = new Magazine("The wale");

        publisher.sendMagazines(magazine1);

        publisher.removeSubscriver(subscriber3);
        publisher.sendMagazines(magazine2);
    }
}