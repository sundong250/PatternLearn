package com.sundong.test.facade;

public class Computer
{
    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer()
    {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void start()
    {
        System.out.println("computer start begin------");
        cpu.startCpu();
        disk.startDisk();
        memory.startMemory();
        System.out.println("computer start end--------");
    }

    public void shutdown()
    {
        System.out.println("computer shutdown begin-----");
        cpu.shutdownCpu();
        disk.shutdownDisk();
        memory.shutdownMemory();
        System.out.println("computer shutdown end-------");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println("\n");
        computer.shutdown();
    }
}
