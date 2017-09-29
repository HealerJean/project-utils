package com.hlj.designpatterns.FactoryMethod.manyMethod;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:01:19 
 * 类说明  工厂方法模式 多个方法工厂模式
 */
public class MailSender implements Sender {  
    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
} 