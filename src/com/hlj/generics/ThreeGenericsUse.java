package com.hlj.generics;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��20�� ����1:16:27 
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
	    private T ob; // ���巺�ͳ�Ա����  
	  
	    /**
	     * ������
	     * @param ob
	     */
	    public FX(T ob) {  
	        this.ob = ob;  
	    }  
	  
	    public T getOb() {  
	        return ob;  
	    }  
	  
	    public void showTyep() {  
	        System.out.println("T��ʵ��������: " + ob.getClass().getName());  
	    }  
	}  
	
}
