package InstrumentsFactories;

import Basses.Bass;
import Drums.Drum;
import Guitars.Guitar;

public interface InstrumentsFactory {
    public Guitar makeGuitar();
    public Bass makeBass();
    public Drum makeDrum();
}
