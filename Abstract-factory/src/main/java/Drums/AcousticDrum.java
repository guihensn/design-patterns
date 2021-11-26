package Drums;

public class AcousticDrum implements Drum{
    @Override
    public void playHighTom() {
        System.out.println("Acoustic drum : Playing the play hight tom");
    }

    @Override
    public void playCrashCymbal() {
        System.out.println("Acoustic drum : Playing the play Crash Cymbal");
    }

    @Override
    public void playHiHats() {
        System.out.println("Acoustic drum : Playing the hi hats");
    }
}
