package com.hlj.generics;

import com.hlj.generics.ThreeMain.FX;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月20日 下午3:44:40 
 * @Description: 不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。
 */
public class FourMain {
	
	public static void main(String[] args) {
	    FX<Number> ex_num = new FX<Number>(100);  
	    FX<Integer> ex_int = new FX<Integer>(200);  
	    
	/*	报错，不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。不确定的应该使用？
	 	if(ex_num instanceof FX<Number>){   
		} 
	 */
	    if(ex_num instanceof FX<?>){   
		} 
	}
	
	public static class FX<T> {  
	    private T ob;   
	    public FX(T ob) {  
	        this.ob = ob;  
	    }  
	}  
}
