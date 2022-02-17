package com.sundong.test.strategy;

public class FlyWithRocket implements FlyingStrategy{
    @Override
    public void performFly() {
        System.out.println("用火箭飞行");
    }
}
