package com.sundong.test.proxy;

public class Test
{
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
        System.out.println("\n");
        System.out.println("---------------");
        System.out.println("\n");
        AdvancedProxy advancedProxy = new AdvancedProxy();
        advancedProxy.request();
    }
}
