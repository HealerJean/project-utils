package com.hlj.designpatterns.AbstractFactory;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:36:26 
 * 类说明 
 */
public class SendMailFactory implements Provider {  
    
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
}