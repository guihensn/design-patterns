import Computers.GamerComputer;
import Factories.GamerComputerFactory;
import Factories.NormalComputerFactory;
import Computers.NormalComputer;

public class FactoriesTest {
    public static void main(String args[]){
        GamerComputerFactory gamerComputerFactory = new GamerComputerFactory();
        NormalComputerFactory normalComputerFactory = new NormalComputerFactory();

        NormalComputer normalComputer = normalComputerFactory.makeComputer();
        GamerComputer gamerComputer = gamerComputerFactory.makeComputer();


        normalComputer.run();

        System.out.println();
        gamerComputer.run();


    }
}
