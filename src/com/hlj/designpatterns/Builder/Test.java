package com.hlj.designpatterns.Builder;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午10:29:07 
 * 类说明  、建造者模式
 */
public class Test {  
	  
    public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceMailSender(10);  
    }  
}