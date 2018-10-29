package com.hlj.designpatterns.Singleton.one;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:57:27 
 * ��˵�� 
 */
public class Singleton {  
	  
    /* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */   
    private static Singleton instance = null;  
  
    /* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() {  
    }  
  
    /* 1����̬���̷���������ʵ�� */  
    /*  public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  */
   /**
    * ����̰߳�ȫ synchronized ����
    */
    public static synchronized Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return instance;  
    }  
}


