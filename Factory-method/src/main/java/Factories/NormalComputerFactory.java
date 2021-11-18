package Factories;

import Computers.NormalComputer;
import Parts.CPU;
import Parts.HardDisk;
import Parts.RAM;

public class NormalComputerFactory extends ComputerFactory {

    @Override
    public NormalComputer makeComputer() {
        CPU cpu = new CPU("3GHz");
        HardDisk hardDisk = new HardDisk("300Gb");
        RAM ram = new RAM("4Gb");

        NormalComputer computer = new NormalComputer();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setRam(ram);

        return computer;
    }
}
