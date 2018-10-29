package com.hlj.designpatterns.AbstractFactory;


/**
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:36:26 
 * ��˵�� 
 */
public class SendMailFactory implements SendFactory {


    @Override
    public Sender produce(){
        return new MailSender();
    }
}