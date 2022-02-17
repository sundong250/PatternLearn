package com.sundong.test.strategy;

public class FlyNoWay implements FlyingStrategy
{
    @Override
    public void performFly() {
        System.out.println("我不会飞行");
    }
}
