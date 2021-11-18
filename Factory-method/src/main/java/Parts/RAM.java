package Parts;

public class RAM {
    public String size;

    public RAM(String model){
        this.size = model;
    }

    public void store(){
        System.out.println(size + " RAM is storing processes.");
    }
}
