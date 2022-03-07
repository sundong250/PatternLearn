package com.sundong.test.flyweight;

public class FlyweightPattern
{
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        Flyweight f011 = factory.getFlyweight("b");
        Flyweight f012 = factory.getFlyweight("b");
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a"));
        f011.operation(new UnsharedConcreteFlyweight("第1次调用b"));
        f012.operation(new UnsharedConcreteFlyweight("第2次调用b"));
    }
}
