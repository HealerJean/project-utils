package com.hlj.designpatterns.Singleton.one;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午10:15:12 
 * 类说明 
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