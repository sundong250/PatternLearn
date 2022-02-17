package com.sundong.test.strategy;

public class Test
{
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.quack();
        duck.fly();
    }
}
