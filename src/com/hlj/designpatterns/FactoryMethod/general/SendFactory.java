package com.hlj.designpatterns.FactoryMethod.general;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:02:15 
 * ��˵��  ��������ģʽ ��ͨ��������ģʽ
 */
public class SendFactory {  
	  
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("��������ȷ������!");  
            return null;  
        }  
    }  
}