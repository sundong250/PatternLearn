package com.sundong.test.strategy;

public class RubberDuck extends Duck{
    public RubberDuck()
    {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }
    @Override
    public void display() {
        System.out.println("我是橡胶鸭");
    }

    @Override
    public void quack() {
        System.out.println("嘎-嘎-嘎");
    }
}
