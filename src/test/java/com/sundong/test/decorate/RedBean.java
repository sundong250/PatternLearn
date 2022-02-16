package com.sundong.test.decorate;

public class RedBean extends Decorator
{
    public RedBean(Drink drink) {
        super(drink);
    }

    //重写价格

    @Override
    public double money() {
        return super.money() + 3.2;
    }


    //重写描述

    @Override
    public String desc() {
        return super.desc() + "红豆";
    }
}
