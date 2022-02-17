package com.sundong.test.prototype;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Mail implements Cloneable
{
    public Mail(MailTemplate mailTemplate)
    {
        this.content = mailTemplate.getContent();
        this.subject = mailTemplate.getSubject();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public Mail clone() throws CloneNotSupportedException
    {
        Mail mail = (Mail) super.clone();
        return mail;
    }

    private String mailAddress;
    private String content;
    private String subject;
    private String sender;
}
