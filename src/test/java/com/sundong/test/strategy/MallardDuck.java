package com.sundong.test.strategy;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        super();
        super.setFlyingStrategy(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
}
