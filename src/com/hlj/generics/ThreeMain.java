package com.hlj.generics;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月20日 下午1:36:12 
 * @Description: Number换为“？”编译通过  
 */
public class ThreeMain {
	public static void main(String[] args) {  
	    FX<Number> ex_num = new FX<Number>(100);  
	    FX<Integer> ex_int = new FX<Integer>(200);  
	    getData(ex_num);  
	//    getData(ex_int);//编译错误  
	    
	    getUpperNumberData(ex_num);
	    getUpperNumberData(ex_int);

	}  
	  
	public static void getData(FX<Number> temp) { //此行若把Number换为“？” 或者T 编译通过  
	    //do something...  
	}  
	
	public static void getUpperNumberData(FX<? extends Number> temp){  
	      System.out.println("class type :" + temp.getClass());  
	}       
	public static class FX<T> {  
	    private T ob;   
	    public FX(T ob) {  
	        this.ob = ob;  
	    }  
	}  
}
