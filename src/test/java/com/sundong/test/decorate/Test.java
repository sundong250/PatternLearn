package com.sundong.test.decorate;

public class Test
{
    public static void main(String[] args) {
        //创建豆浆对象
        Drink soya = new Soya();
        System.out.println(soya.money());
        System.out.println(soya.desc());
        //加红糖
        Drink redBeanSoya = new RedBean(soya);
        System.out.println(redBeanSoya.money());
        System.out.println(redBeanSoya.desc());
        //往红豆豆浆里面加入鸡蛋
        Drink egg = new Egg(redBeanSoya);
        System.out.println(egg.money());
        System.out.println(egg.desc());


        Drink fruit = new Fruit();
        Drink eggFruit = new Egg(fruit);
        System.out.println(eggFruit.desc());
    }

}
