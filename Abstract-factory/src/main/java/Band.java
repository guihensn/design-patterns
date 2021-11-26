import Basses.Bass;
import Drums.Drum;
import Guitars.Guitar;

public class Band {
    private Bass bass;
    private Guitar guitar;
    private Drum drum;

    public Band(Bass bass, Guitar guitar, Drum drum) {
        this.bass = bass;
        this.guitar = guitar;
        this.drum = drum;
    }

    public void playMusic(){
        this.bass.playRopeA(5);
        this.bass.playRopeA(1);

        this.guitar.playRopeB(1);
        this.guitar.playRopeG(7);
        this.guitar.playRopeA(2);
        this.guitar.playRopeD(2);

        this.drum.playCrashCymbal();
        this.drum.playCrashCymbal();
        this.drum.playHiHats();
    }
}
