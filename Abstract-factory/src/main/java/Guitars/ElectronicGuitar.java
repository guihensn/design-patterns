package Guitars;

public class ElectronicGuitar implements Guitar {
    @Override
    public void playRopeE(int pos) {
        System.out.println("Electronic guitar : Playing the rope E at position " + pos);
    }

    @Override
    public void playRopeB(int pos) {
        System.out.println("Electronic guitar : Playing the rope B at position " + pos);
    }

    @Override
    public void playRopeG(int pos) {
        System.out.println("Electronic guitar : Playing the rope G at position " + pos);
    }

    @Override
    public void playRopeD(int pos) {
        System.out.println("Electronic guitar : Playing the rope D at position " + pos);
    }

    @Override
    public void playRopeA(int pos) {
        System.out.println("Electronic guitar : Playing the rope A at position " + pos);
    }

    @Override
    public void playRopeE2(int pos) {
        System.out.println("Eletronic guitar : Playing the rope E2 at position " + pos);
    }
}
