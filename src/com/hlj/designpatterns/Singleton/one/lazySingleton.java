package com.hlj.designpatterns.Singleton.one;
/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����10:55:33 
 * @Description:
 */
public class lazySingleton {
	
	private static  lazySingleton lazySingleton;//δ��ʼ��
    private lazySingleton(){}
    
    public  static lazySingleton getInstance(){
   		if(lazySingleton == null) {
   			lazySingleton = new lazySingleton();
      }
		return lazySingleton;  
    }

}
