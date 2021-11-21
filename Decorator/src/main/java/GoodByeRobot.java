public class GoodByeRobot extends RobotDecorator{
    public GoodByeRobot(Robot robot){
        super(robot);
    }

    @Override
    public void doSomething() {
        this.robot.doSomething();
        System.out.println("Goodbye human.");
    }
}
