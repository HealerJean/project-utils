package com.hlj.solrArithmetic;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午5:50:22 
 * @Description:
 */
public class InsertionSort {

	 
              
       
    /**
     * 1、直接插入排序 
     */
    @Test
    public  void insertionSort() {
     int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
     System.out.println("----------插入排序开始：---------");
     print(a);
        int tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.printf("第"+i+"趟排序结果,");
            print(a);
        }
        
        System.out.print("最终插入排序结果： ");
        print(a);
        System.out.println("--------------------");
    }
    
    
    /**
     	希尔排序.最小缩量排序  比如 8/8 个数字 4 2 1
     */
    @Test
    public  void sort(){
        int[] arrays = { 49, 38, 65, 97, 76, 13, 27, 50 };
        System.out.println("----------希尔排序开始：---------");
        print(arrays);
        //增量
        int incrementNum = arrays.length/2;
        while(incrementNum >=1){
            for(int i=0;i<arrays.length;i++){
                //进行插入排序
                for(int j=i;j<arrays.length-incrementNum;j=j+incrementNum){
                    if(arrays[j]>arrays[j+incrementNum]){
                        int temple = arrays[j];
                        arrays[j] = arrays[j+incrementNum];
                        arrays[j+incrementNum] = temple;
                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum/2;
        }
        print(arrays);
        
    }
    
    
    
    
    /**
     	冒泡排序
     */
    @Test
    public  void maopao(){
        int str[] = { 49, 38, 65, 97, 76, 13, 27, 50 };
        System.out.println("----------冒泡排序 开始：---------");

        for (int i = 0; i <str.length-1; i++){    //最多做n-1趟排序
            for(int j = 0 ;j <str.length - i - 1; j++){    //对当前无序区间str[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
                if(str[j] > str[j + 1]){    //把小的值放到前面
                    int temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            } 
            int n = i+1;
            System.out.printf("第"+n+"趟排序结果,");
            print(str);
        }
            System.out.print("最终排序结果：");
            print(str);
               

    }

    
    
    
    
    
 
    /**
     * 
   	打印的结果
     */
    private static void print(int []a) {
    	 for (int i : a){
             System.out.print(i + " ");
         }
    	 System.out.println();
	}

}
