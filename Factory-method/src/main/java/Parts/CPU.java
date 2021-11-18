package Parts;

public class CPU {
    public String clock;

    public CPU(String model){
        this.clock = model;
    }

    public void operate(){
        System.out.println(clock + " CPU is executing processes.");
    }
}
