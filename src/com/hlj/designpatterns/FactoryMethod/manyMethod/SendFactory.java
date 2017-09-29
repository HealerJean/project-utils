package com.hlj.designpatterns.FactoryMethod.manyMethod;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:02:15 
 * 类说明  工厂方法模式 多个方法工厂模式
 */
public class SendFactory {  
	   public Sender produceMail(){  
	        return new MailSender();  
	    }  
	      
	    public Sender produceSms(){  
	        return new SmsSender();  
	    }  
	} 