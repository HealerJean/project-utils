package com.hlj.generics;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月20日 下午1:16:27 
 * @Description:
 */
public class ThreeGenericsNoUse {

	public static void main(String[] args) {  
        FX intOb = new FX(new Integer(100));  
        intOb.showTyep();  
        System.out.println("value= " + intOb.getOb());  
        System.out.println("----------------------------------");  
  
        FX strOb = new FX("CSDN_SEU_Calvin");  
        strOb.showTyep();  
        System.out.println("value= " + strOb.getOb());  
    }  

	public static class FX {  
	    private Object ob; // 定义泛型成员变量  
	  
	    public FX(Object ob) {  
	        this.ob = ob;  
	    }  
	  
	    public Object getOb() {  
	        return ob;  
	    }  
	  
	    public void showTyep() {  
	        System.out.println("T的实际类型是: " + ob.getClass().getName());  
	    }  
	}  
	  
	
}
