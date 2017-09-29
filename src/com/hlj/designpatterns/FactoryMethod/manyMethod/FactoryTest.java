package com.hlj.designpatterns.FactoryMethod.manyMethod;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:02:37 
 * 类说明  工厂方法模式 多个方法工厂模式
 */
public class FactoryTest {  
	  
    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send();  
    }  
}