package com.sundong.test.decorate;

public class Fruit implements Drink{
    @Override
    public double money() {
        return 6;
    }

    @Override
    public String desc() {
        return "果汁";
    }
}
