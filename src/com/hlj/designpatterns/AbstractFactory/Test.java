package com.hlj.designpatterns.AbstractFactory;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:36:58 
 * 类说明 
 */
public class Test {  
	  
    public static void main(String[] args) {  
    	//使用哪个，new哪个对象即可（和我在中科软中遇到的情况情况是一样的）
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
    }  
} 