package com.hlj.designpatterns.FactoryMethod.manyMethod;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:01:19 
 * ��˵��  ��������ģʽ �����������ģʽ
 */
public class MailSender implements Sender {  
    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
} 