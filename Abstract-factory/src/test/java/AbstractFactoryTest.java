import Basses.Bass;
import Drums.Drum;
import Guitars.Guitar;
import InstrumentsFactories.AcousticInstrumentsFactory;
import InstrumentsFactories.ElectronicInstrumentsFactory;
import InstrumentsFactories.InstrumentsFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        InstrumentsFactory electronicFactory = new ElectronicInstrumentsFactory();
        InstrumentsFactory acousticFactory = new AcousticInstrumentsFactory();

        Band acousticBand = makeBand(electronicFactory);
        Band eletronicBand = makeBand(acousticFactory);

        System.out.println("-------The acoustic band is playing -----\n");
        acousticBand.playMusic();

        System.out.println("\n-------The eletronic band is playing -----\n");
        eletronicBand.playMusic();
    }

    public static Band makeBand(InstrumentsFactory factory){
        Guitar guitar = factory.makeGuitar();
        Bass bass = factory.makeBass();
        Drum drum = factory.makeDrum();

        Band band = new Band(bass, guitar, drum);
        return band;
    }
}
