package com.sundong.test.proxy;

public class Proxy implements Subject{
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null)
        {
            realSubject = new RealSubject();
        }
        beforeRequest();
        realSubject.request();
        afterRequest();
    }

    public void afterRequest() {
        System.out.println("proxy before visit real subject");
    }

    public void beforeRequest() {
        System.out.println("proxy after visit real subject");
    }
}
