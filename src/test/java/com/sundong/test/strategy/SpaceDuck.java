package com.sundong.test.strategy;

public class SpaceDuck extends Duck
{
    public SpaceDuck()
    {
        super();
        super.setFlyingStrategy(new FlyWithRocket());
    }
    @Override
    public void display() {
        System.out.println("我是太空鸭");
    }

    @Override
    public void quack() {
        System.out.println("我通过无线电通信");
    }
}
