package com.hlj.designpatterns.AbstractFactory;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:36:03 
 * 类说明 
 */
public class SendSmsFactory implements Provider{  
	  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  