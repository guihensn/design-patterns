package Parts;

public class HardDisk {
    public String size;

    public HardDisk(String model){
        this.size = model;
    }

    public void persist(){
        System.out.println(size + " HardDisk is Persisting a file.");
    }
}
