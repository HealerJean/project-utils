package com.hlj.designpatterns.Singleton.one;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����10:15:12 
 * ��˵�� 
 */
public class SingletonFinal {  
	  
    private static SingletonFinal instance = null;  
  
    private SingletonFinal() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new SingletonFinal();  
        }  
    }  
  
    public static SingletonFinal getInstance() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }  
}  