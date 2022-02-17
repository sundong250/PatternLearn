package com.sundong.test.builder;

public class HPComputerBuilder extends ComputerBuilder
{

    @Override
    public void buildMaster() {
        computer.setMaster("i7,16g,512ssd,1060");
        System.out.println("i7,16g,512ssd,1060配置的惠普主机");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("1080P");
        System.out.println("1080P的显示器");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("双飞燕");
        System.out.println("双飞燕的键盘");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("雷蛇");
        System.out.println("雷蛇的鼠标");
    }

    @Override
    public void buildAudio() {
        computer.setAudio("飞利浦");
        System.out.println("飞利浦的音响");
    }
}
