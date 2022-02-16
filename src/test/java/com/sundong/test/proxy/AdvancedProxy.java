package com.sundong.test.proxy;

public class AdvancedProxy extends Proxy
{
    @Override
    public void beforeRequest() {
        System.out.println("advanced before visit real subject");
    }

    @Override
    public void afterRequest() {
        System.out.println("advanced before visit real subject");
    }
}
