package com.hlj.DynamicProxy.java;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

import com.hlj.DynamicProxy.RealSubject;
import com.hlj.DynamicProxy.Subject;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��28�� ����10:22:32 
 * @Description:
 */
public class DynamicProxyMain {
	public static void main( String args[] )   
	  {   

        // ����Ҫ�������ʵ����
        Subject realSubject = new RealSubject();

        // ����Ҫ�����ĸ���ʵ���󣬾ͽ��ö��󴫽�ȥ�������ͨ������ʵ�����������䷽����
        ProxyHandler handler = new ProxyHandler(realSubject);

        /*
         * ͨ��Proxy��newProxyInstance�������������ǵĴ��������������������������
         * ��һ������ handler.getClass().getClassLoader() ��
        	  ��������ʹ��handler������ClassLoader�������������ǵĴ������
         * �ڶ�������realSubject.getClass().getInterfaces()��
         	��������Ϊ��������ṩ�Ľӿ�����ʵ������ʵ�еĽӿڣ���ʾ��Ҫ������Ǹ���ʵ���������Ҿ��ܵ�������ӿ��еķ�����
         * ����������handler�� �������ｫ������������������Ϸ��� InvocationHandler ���������
         */
        Subject subject = (Subject)Proxy.newProxyInstance(
					        		handler.getClass().getClassLoader(), 
					        		realSubject .getClass().getInterfaces(),
					        		handler);
        /**
          ����ſ�ʼִ��
         */
        System.out.println(subject.getClass().getName());
        System.out.println();
        subject.one();
        System.out.println();
        subject.two();
         
    }   
	 
}



