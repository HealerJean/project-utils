package com.hlj.designpatterns.FactoryMethod.staticpattern;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:02:15 
 * ��˵��  ��������ģʽ  ��̬��������ģʽ
 */
public class SendFactory {  
    
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}  