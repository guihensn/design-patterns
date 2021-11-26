package InstrumentsFactories;

import Basses.Bass;
import Basses.ElectronicBass;
import Drums.Drum;
import Drums.ElectronicDrum;
import Guitars.ElectronicGuitar;
import Guitars.Guitar;

public class ElectronicInstrumentsFactory implements InstrumentsFactory{
    @Override
    public Guitar makeGuitar() {
        return new ElectronicGuitar();
    }

    @Override
    public Bass makeBass() {
        return new ElectronicBass();
    }

    @Override
    public Drum makeDrum() {
        return new ElectronicDrum();
    }
}
