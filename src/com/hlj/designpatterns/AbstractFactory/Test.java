package com.hlj.designpatterns.AbstractFactory;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:36:58 
 * ��˵�� 
 */
public class Test {  
	  
    public static void main(String[] args) {  
    	//ʹ���ĸ���new�ĸ����󼴿ɣ��������п�������������������һ���ģ�
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
    }  
} 