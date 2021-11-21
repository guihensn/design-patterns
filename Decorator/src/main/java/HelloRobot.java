public class HelloRobot extends  RobotDecorator{

    public HelloRobot(Robot robot){
        super(robot);
    }
    @Override
    public void doSomething() {
        System.out.println("Hello");
        this.robot.doSomething();
    }
}
