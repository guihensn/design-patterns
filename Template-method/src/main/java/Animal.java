public abstract class Animal {

    public void doRoutine(){
        WakeUp();
        move();
        eat();
        sleep();
    }

    public  void WakeUp(){
        System.out.println("The " + this.getClass().getName() +" woked up");
    };

    public void move(){};

    public void eat(){
        System.out.println("Ate some food");
    }
    public void sleep() {
        System.out.println("Closed the eyes and sleeped \n");
    }
}
