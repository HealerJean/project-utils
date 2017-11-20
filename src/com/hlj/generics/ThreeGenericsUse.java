package com.hlj.generics;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月20日 下午1:16:27 
 * @Description:
 */
public class ThreeGenericsUse {
	
    public static void main(String[] args) {  
        FX<Integer> intOb = new FX<Integer>(100);  
        intOb.showTyep();  
        System.out.println("value= " + intOb.getOb());  
        System.out.println("----------------------------------");  
  
        FX<String> strOb = new FX<String>("CSDN_SEU_Calvin");  
        strOb.showTyep();  
        System.out.println("value= " + strOb.getOb());  
    }
    
	public static class FX<T> {  
	    private T ob; // 定义泛型成员变量  
	  
	    /**
	     * 构造器
	     * @param ob
	     */
	    public FX(T ob) {  
	        this.ob = ob;  
	    }  
	  
	    public T getOb() {  
	        return ob;  
	    }  
	  
	    public void showTyep() {  
	        System.out.println("T的实际类型是: " + ob.getClass().getName());  
	    }  
	}  
	
}
