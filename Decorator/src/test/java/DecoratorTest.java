public class DecoratorTest {
    public static void main(String[] args) {

        Robot defaultRobot = new DefaultRobot();
        Robot workerRobot = new WorkerRobot(new DefaultRobot());
        Robot socialRobot = new GoodByeRobot(new HelloRobot(new DefaultRobot()));

        System.out.println("---------Default Robot-------");
        defaultRobot.doSomething();

        System.out.println("---------Social Robot--------");
        socialRobot.doSomething();

        System.out.println("---------Worker Robot--------");
        workerRobot.doSomething();
    }
}
