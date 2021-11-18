package Factories;

import Computers.GamerComputer;
import Parts.*;

public class GamerComputerFactory extends ComputerFactory {

    @Override
    public GamerComputer makeComputer() {
        CPU cpu = new CPU("4Gb");
        HardDisk hardDisk = new HardDisk("600Gb");
        RAM ram = new RAM("16Gb");
        GPU gpu = new GPU("3GHz");

        GamerComputer computer = new GamerComputer();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setRam(ram);
        computer.setGpu(gpu);

        return computer;
    }
}
