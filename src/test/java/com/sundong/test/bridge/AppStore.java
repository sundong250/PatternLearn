package com.sundong.test.bridge;

public class AppStore implements Software
{
    @Override
    public void run() {
        System.out.println("app store run");
    }

    public static void main(String[] args) {
        Oppo oppo = new Oppo();
        Camera camera = new Camera();
        oppo.setSoftware(camera);
        oppo.run();
    }
}
