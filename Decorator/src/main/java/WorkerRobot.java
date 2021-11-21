public class WorkerRobot extends RobotDecorator{
    public WorkerRobot(Robot robot) {
        super(robot);
    }

    @Override
    public void doSomething() {
        System.out.println("I am busy now, I am working.");
        this.robot.doSomething();
    }
}
