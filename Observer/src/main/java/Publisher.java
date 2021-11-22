import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeSubscriver(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void sendMagazines(Magazine magazine) {
        this.subscribers.forEach(subscriber -> {
            subscriber.readMagazine(magazine);
        });
    }
}
