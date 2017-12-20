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
     	2��ϣ������.��С��������  ���� 8/8 ������ 4 2 1
     */
    @Test
    public  void sort(){
        int[] as = { 49, 38, 65, 97, 76, 13, 27, 50 };
        System.out.println("----------ϣ������ʼ��---------");
        print(as);
        //����
        int incr = as.length/2;
        while(incr >=1){
            for(int i=0;i<as.length;i++){
                //���в�������
                for(int j=i;j<as.length-incr;j=j+incr){
                    if(as[j]>as[j+incr]){
                        int temple = as[j];
                        as[j] = as[j+incr];
                        as[j+incr] = temple;
                    }
                }
            }
            //�����µ�����
            incr = incr/2;
        }
        print(as);
        
    }
    
    
    
    
    /**
     	3��ð������
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

    
    
    
 /*------------start ð�������Ż�---------------------------- */       
    
    
    /* 
     * ð�������Ż�һ 
     * ����һ���������־һ�˱Ƚ��Ƿ������� 
     * ���û�з����������������Ѿ����� 
     * */ 
    @Test
    public void bubbleSort1() {  
        int arr[] = { 49, 38, 65, 97, 76, 13, 27, 50 };
        int  n = arr.length;
        int i = 0;  
        int j = 0;  
        int tmp = 0;  
        int flag = 0;   
        for (i = 0; i < n; ++i) {  
            flag = 0;  
            for (j = 0; j < n - 1 - i; ++j) {  
                if (arr[j] > arr[j + 1]) {  
                    flag = 1;  
                    tmp = arr[j];  
                    arr[j] = arr[j + 1];  
                    arr[j + 1] = tmp;  
                }  
            }  
            if (flag == 0) {  
                break;  
            }  
        } 
        
        print(arr);

    }  
      
    /* 
     * ð�������Ż��� 
     * ��һ��������¼�����һ������������λ�ã�����û�з����������Ѿ����� 
     * ���Կ��������ֵ����Ϊ��һ�αȽϽ�����λ�� 
     * */  
    @Test
    public void bubbleSort2() {  
        int arr[] = { 49, 38, 65, 97, 76, 13, 27, 50 };
        int  n = arr.length;
        int i = 0;  
        int j = 0;  
        int k = 0;  
        int tmp = 0;  
        int flag = n;   
        for (i = 0; i < flag; ++i) {  
            k = flag;  
            flag = 0;  
            for (j = 0; j < k; ++j) {  
                if (arr[j] < arr[j + 1]) {  
                    flag = j;  
                    tmp = arr[j];  
                    arr[j] = arr[j + 1];  
                    arr[j + 1] = tmp;  
                }  
            }  
        }     
        print(arr);

    }   
    
    
    
    
    
    
    
    
    
    
    
/*-----------------------end ð�������Ż�---------------------------- */       
    
    
    
    
    
    /* 
     * 4.�������� ���������м俿£
     */
    public void QuickSort(int []a, int low, int high){   
    
        int i=low,j=high;  
        if(i<j){  
            int po = a[low];  
            while(i<j){  
                while(i<j && po<a[j]){   //�Ӻ���ǰ�� j++
                    j--;  
                }  
                if(i<j){  
                    int temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                    i++;  
                }  
                
                
                while(i<j && po>a[i]){   //��ǰ������ i++
                    i++;  
                } 
                if(i<j){  
                    int temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                    j--;  
                }  
            }  
            QuickSort(a,low,j-1);   //��С��J
            QuickSort(a,j+1,high);  //��J����
        }  
    }
    
    /* 
     * 4.��������  ���Է���
     */
    @Test
    public void kspx(){
    	int []a = { 49, 38, 65, 97, 76, 13, 27, 50 };
    	int low = 0;
    	int high = a.length-1;
    	QuickSort(a, 0, a.length-1);  
    	print(a);
    }
    
    
    
    /* 
     * 5.��ѡ������
     *  ÿ��ѡ����С�ķŵ���ǰ��
     */
    @Test
    public void SelectSort()
    {
    	int []a = { 49, 38, 65, 97, 76, 13, 27, 50 };
    	int aCount = a.length;
    	int min;
    	for(int i = 0; i < aCount - 1; ++i)
    	{
    		min = i;
    		for(int j = i + 1; j < aCount; ++j)
    		{
    			if(a[j] < a[min])  //ʹ��min����ָ����СԪ��
    				min = j;
    		}
    		if(min != i)  //��min���ƶ���
    		{
    			int temp = a[i];
    			a[i] = a[min];
    			a[min] = temp;
    		}
    	}	
    	print(a);
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
