public class StrategyTest {
    public static void main(String args[]) {
        Camera camera = new Camera();
        Gun gun = new Gun();
        Phone phone = new Phone();
        Watch watch = new Watch();

        Person person = new Person(camera);
        person.getGadget().active();

        person.setGadget(gun);
        person.getGadget().active();

        person.setGadget(phone);
        person.getGadget().active();

        person.setGadget(watch);
        person.getGadget().active();
    }
}
