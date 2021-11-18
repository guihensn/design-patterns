package Computers;

import Computers.Computer;
import Parts.CPU;
import Parts.HardDisk;
import Parts.RAM;

public class NormalComputer implements Computer {
    private HardDisk hardDisk;
    private CPU cpu;
    private RAM ram;

    public void run(){
        System.out.println("Normal computer is working");
        cpu.operate();
        ram.store();
        hardDisk.persist();
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
