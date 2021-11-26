package Drums;

public class ElectronicDrum implements Drum{
    @Override
    public void playHighTom() {
        System.out.println("Electronic drum : Playing the play hight tom");
    }

    @Override
    public void playCrashCymbal() {
        System.out.println("Electronic drum : Playing the play Crash Cymbal");
    }

    @Override
    public void playHiHats() {
        System.out.println("Electronic drum : Playing the hi hats");
    }
}
