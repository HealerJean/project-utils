package com.hlj.designpatterns.FactoryMethod.staticpattern;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:02:15 
 * 类说明  工厂方法模式  静态工厂方法模式
 */
public class SendFactory {  
    
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}  