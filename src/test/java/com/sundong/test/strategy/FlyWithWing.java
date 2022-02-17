package com.sundong.test.strategy;

public class FlyWithWing implements FlyingStrategy
{
    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
