package com.sundong.test.strategy;

public class RedHeadDuck extends Duck
{
    public RedHeadDuck()
    {
        super();
        super.setFlyingStrategy(new FlyWithWing());
    }
    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}
