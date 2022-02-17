package com.sundong.test.prototype;

import java.util.Random;

public class MailTest
{
    //不使用原型模式
    /*public static void main(String[] args) {
        int i = 0;
        int MAX_COUNT = 10;

        MailTemplate mailTemplate = new MailTemplate("content", "subject");
        long start = System.currentTimeMillis();
        while (i < MAX_COUNT)
        {
            Mail mail = new Mail(mailTemplate);
            mail.setMailAddress("send to" + Math.random());
            mail.setSender("send by" + Math.random());
            System.out.println(mail.toString());
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println("用时： " + (end - start));
    }*/
    //使用原型模式
    public static void main(String[] args) {
        int i = 0;
        int MAX_COUNT = 10;

        MailTemplate mailTemplate = new MailTemplate("content", "subject");
        long start = System.currentTimeMillis();
        Mail mail = new Mail(mailTemplate);
        while (i < MAX_COUNT)
        {
            try {
                mail.setMailAddress("send to" + Math.random());
                mail.setSender("send by" + Math.random());
                Mail cloneMail = mail.clone();
                System.out.println(cloneMail.toString());
            }
            catch (CloneNotSupportedException e)
            {
                e.printStackTrace();
            };
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println("总用时 ： " + (end - start));
    }
}
