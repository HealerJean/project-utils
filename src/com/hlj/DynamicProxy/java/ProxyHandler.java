package com.hlj.DynamicProxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��28�� ����10:19:50 
 * @Description:
 */
public class ProxyHandler implements InvocationHandler   
{

	//�������������Ҫ�������ʵ����
	  private Object proxied;   
	     
	  // ���췽����������Ҫ�������ʵ���󸳳�ֵ
	  public ProxyHandler( Object proxied )   
	  {   
	    this.proxied = proxied;   
	  }   
	  

	    @Override
	    public Object invoke(Object object, Method method, Object[] args)
	            throws Throwable
	    {
	        //�����ڴ�����ʵ����ǰ���ǿ������һЩ�Լ��Ĳ���
	        System.out.println("before rent house");
	        
	        System.out.println("Method:" + method);
	        
	        //    ��������������ʵ����ķ���ʱ������Զ�����ת��������������handler�����invoke���������е���
	        method.invoke(proxied, args);
	        
	        //�����ڴ�����ʵ���������Ҳ�������һЩ�Լ��Ĳ���
	        System.out.println("after rent house");
	        
	        return null;
	    }
	  
} 