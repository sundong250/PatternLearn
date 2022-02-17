package com.sundong.test.strategy;

public abstract class Duck
{
    public void quack()
    {
        System.out.println("嘎嘎嘎");
    }

    public abstract void display();

    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy)
    {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly()
    {
        flyingStrategy.performFly();
    }
}
