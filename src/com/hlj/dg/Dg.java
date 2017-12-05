package com.hlj.dg;

public class Dg {


    public static void main(String[] args){
    //    System.out.println(Fribonacci(2));
        
        //n的阶乘 
        System.out.println(f(0));

    }
    /**
     * 
     * @author :HealerJean: 
     * @date   :2017年11月23日 下午1:54:47 
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
     * @date   :2017年11月23日 下午1:58:51 
     * @Description: n的阶乘
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
