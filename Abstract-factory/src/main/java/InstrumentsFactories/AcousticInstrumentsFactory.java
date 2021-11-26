package InstrumentsFactories;

import Basses.AcousticBass;
import Basses.Bass;
import Drums.AcousticDrum;
import Drums.Drum;
import Guitars.AcousticGuitar;
import Guitars.Guitar;

public class AcousticInstrumentsFactory implements InstrumentsFactory {
    @Override
    public Guitar makeGuitar() {
        return new AcousticGuitar();
    }

    @Override
    public Bass makeBass() {
        return new AcousticBass();
    }

    @Override
    public Drum makeDrum() {
        return new AcousticDrum();
    }
}
