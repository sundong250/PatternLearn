package com.sundong.test.proxy;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("visit real subject");
    }

    @Override
    public void beforeRequest() {
        System.out.println("after visit real subject");
    }

    @Override
    public void afterRequest() {
        System.out.println("after visit real subject");
    }
}
