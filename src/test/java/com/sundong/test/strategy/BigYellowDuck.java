package com.sundong.test.strategy;

public class BigYellowDuck extends Duck{
    public BigYellowDuck()
    {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }
    @Override
    public void display() {
        System.out.println("我是大黄鸭");
    }
}
