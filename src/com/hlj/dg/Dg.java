package com.hlj.dg;

public class Dg {


    public static void main(String[] args){
    //    System.out.println(Fribonacci(2));
        
        //n�Ľ׳� 
        System.out.println(f(0));

    }
    /**
     * 
     * @author :HealerJean: 
     * @date   :2017��11��23�� ����1:54:47 
     * @Description:1 1 2 3 5 8 13
     * @param n
     * @return    
     * int
     */
    public static int Fribonacci(int n){
        if(n<=2)
            return 1;
        else
            return Fribonacci(n-1)+Fribonacci(n-2);

    }
    
    /**
     * 
     * @author :HealerJean: 
     * @date   :2017��11��23�� ����1:58:51 
     * @Description: n�Ľ׳�
     * @param n
     * @return    
     * int
     */
    public static int f(int n){
    	
    	if(n<=1){
    		return 1;
    	}else {
    		return n * f(n-1);
    	}
    }
}
