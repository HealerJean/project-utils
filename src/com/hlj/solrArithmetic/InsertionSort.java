package com.hlj.solrArithmetic;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����5:50:22 
 * @Description:
 */
public class InsertionSort {

	 
              
       
    /**
     * 1��ֱ�Ӳ������� 
     */
    @Test
    public  void insertionSort() {
     int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
     System.out.println("----------��������ʼ��---------");
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
            System.out.printf("��"+i+"��������,");
            print(a);
        }
        
        System.out.print("���ղ����������� ");
        print(a);
        System.out.println("--------------------");
    }
    
    
    /**
     	ϣ������.��С��������  ���� 8/8 ������ 4 2 1
     */
    @Test
    public  void sort(){
        int[] arrays = { 49, 38, 65, 97, 76, 13, 27, 50 };
        System.out.println("----------ϣ������ʼ��---------");
        print(arrays);
        //����
        int incrementNum = arrays.length/2;
        while(incrementNum >=1){
            for(int i=0;i<arrays.length;i++){
                //���в�������
                for(int j=i;j<arrays.length-incrementNum;j=j+incrementNum){
                    if(arrays[j]>arrays[j+incrementNum]){
                        int temple = arrays[j];
                        arrays[j] = arrays[j+incrementNum];
                        arrays[j+incrementNum] = temple;
                    }
                }
            }
            //�����µ�����
            incrementNum = incrementNum/2;
        }
        print(arrays);
        
    }
    
    
    
    
    /**
     	ð������
     */
    @Test
    public  void maopao(){
        int str[] = { 49, 38, 65, 97, 76, 13, 27, 50 };
        System.out.println("----------ð������ ��ʼ��---------");

        for (int i = 0; i <str.length-1; i++){    //�����n-1������
            for(int j = 0 ;j <str.length - i - 1; j++){    //�Ե�ǰ��������str[0......length-i-1]��������(j�ķ�Χ�ܹؼ��������Χ��������С��)
                if(str[j] > str[j + 1]){    //��С��ֵ�ŵ�ǰ��
                    int temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            } 
            int n = i+1;
            System.out.printf("��"+n+"��������,");
            print(str);
        }
            System.out.print("������������");
            print(str);
               

    }

    
    
    
    
    
 
    /**
     * 
   	��ӡ�Ľ��
     */
    private static void print(int []a) {
    	 for (int i : a){
             System.out.print(i + " ");
         }
    	 System.out.println();
	}

}
