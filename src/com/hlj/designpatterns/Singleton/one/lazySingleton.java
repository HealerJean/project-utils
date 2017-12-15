package com.hlj.designpatterns.Singleton.one;
/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 上午10:55:33 
 * @Description:
 */
public class lazySingleton {
	
	private static  lazySingleton lazySingleton;//未初始化
    private lazySingleton(){}
    
    public  static lazySingleton getInstance(){
   		if(lazySingleton == null) {
   			lazySingleton = new lazySingleton();
      }
		return lazySingleton;  
    }

}
