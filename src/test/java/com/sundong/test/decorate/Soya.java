package com.sundong.test.decorate;

public class Soya implements Drink
{
    //被装饰者
    @Override
    public double money() {
        return 5;
    }

    @Override
    public String desc() {
        return "纯豆浆";
    }
}
