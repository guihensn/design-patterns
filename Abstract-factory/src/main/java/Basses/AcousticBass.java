package Basses;

public class AcousticBass implements Bass {
    @Override
    public void playRopeG(int position) {
        System.out.println("Acoustic Bass: Playing the rope G at position " + position);
    }

    @Override
    public void playRopeD(int position) {
        System.out.println("Acoustic Bass: Playing the rope D at position " + position);
    }

    @Override
    public void playRopeA(int position) {
        System.out.println("Acoustic Bass: Playing the rope A at position " + position);
    }

    @Override
    public void playRopeE2(int position) {
        System.out.println("Acoustic Bass: Playing the rope E2 at position " + position);
    }
}
