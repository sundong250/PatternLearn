package com.sundong.test.builder;

public class Director
{
    private ComputerBuilder computerBuilder;
    public void setComputerBuilder(ComputerBuilder computerBuilder)
    {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer()
    {
        return computerBuilder.getComputer();
    }

    public void constructComputer()
    {
        computerBuilder.buildComputer();
        computerBuilder.buildMaster();
        computerBuilder.buildScreen();
        computerBuilder.buildKeyboard();
        computerBuilder.buildMouse();
        computerBuilder.buildAudio();
    }

    public static void main(String[] args) {
        Director director = new Director();
        director.setComputerBuilder(new HPComputerBuilder());
        director.constructComputer();
        System.out.println(director.getComputer().toString());
    }
}
