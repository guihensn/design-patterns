package Computers;

import Parts.*;

public class GamerComputer implements Computer {
    private HardDisk hardDisk;
    private CPU cpu;
    private GPU gpu;
    private RAM ram;

    public void run(){
        System.out.println("Gamer computer is working");
        cpu.operate();
        gpu.operate();
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

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }
}
