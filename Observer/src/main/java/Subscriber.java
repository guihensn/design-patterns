public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void readMagazine(Magazine magazine) {
        System.out.println(name +" is reading the new magazine: " + magazine.getTitle());
    }
}
