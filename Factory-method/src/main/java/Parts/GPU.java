package Parts;

public class GPU {
    public String clock;

    public GPU(String model){
        this.clock = model;
    }

    public void operate(){
        System.out.println(clock + " GPU is processing graphics.");
    }
}
