package com.hlj.designpatterns.FactoryMethod.manyMethod;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:02:37 
 * ��˵��  ��������ģʽ �����������ģʽ
 */
public class FactoryTest {  
	  
    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send();  
    }  
}