package com.hlj.designpatterns.FactoryMethod.manyMethod;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:02:15 
 * ��˵��  ��������ģʽ �����������ģʽ
 */
public class SendFactory {  
	   public Sender produceMail(){  
	        return new MailSender();  
	    }  
	      
	    public Sender produceSms(){  
	        return new SmsSender();  
	    }  
	} 