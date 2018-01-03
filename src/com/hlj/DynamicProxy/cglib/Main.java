package com.hlj.DynamicProxy.cglib;

import com.hlj.DynamicProxy.RealSubject;
import com.hlj.DynamicProxy.Subject;

import net.sf.cglib.proxy.Enhancer;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月28日 上午11:14:38 
 * @Description:
 */
public class Main {
	
	public static void main(String[] args) {  
        CglibProxy cglibProxy = new CglibProxy();  
  
        Enhancer enhancer = new Enhancer();   //增强剂
        enhancer.setSuperclass(RealSubject.class);  
        enhancer.setCallback(cglibProxy);  
  
        Subject subject = (Subject)enhancer.create();  
  
        System.out.println(subject.getClass().getName());
        System.out.println();
        subject.one();
        System.out.println();
        subject.two();
    }  
}
