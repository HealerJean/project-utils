package com.hlj.designpatterns.FactoryMethod.general;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:02:15 
 * 类说明  工厂方法模式 普通工厂方法模式
 */
public class SendFactory {  
	  
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  
}