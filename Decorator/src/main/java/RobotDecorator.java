public abstract  class RobotDecorator implements Robot{
    protected Robot robot;

    public RobotDecorator(Robot robot){
        this.robot = robot;
    }
}
