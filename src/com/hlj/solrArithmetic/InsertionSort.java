package com.hlj.solrArithmetic;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����5:50:22 
 * @Description:
 */
public class InsertionSort {

	 
              

    /**
     * 1��ֱ�Ӳ������� ��������⣬���������ƶ������ΰ�С�ķŵ�ǰ����
     */
    @Test
    public  void insertionSort() {
     int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
     System.out.println("----------��������ʼ��---------");
     print(a);
        int tmp;
        for (int i = 1; i < a.length; i++) {//��i����1��ʼ��ʾa[1] Ҳ���Ǵӵڶ������ֿ�ʼ���бȽϣ�����n-1������
            for (int j = i; j > 0; j--) { //��i��ֵ��i��Ҳ���ǽ���ǰδ�������ݵ�λ�ø�ֵ��j�������Ѿ���������У��Ĳ���
                if (a[j] < a[j - 1]) { //���д�С���������Ȼ����и�ֵ ְҵ�Ļ������ܹ��õ���������a ��δ���������
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
        int a[] = { 49, 38, 65,  76, 13, 27, 50 ,97};

        for (int i = 0; i <  a.length-1; ++i) {
            int  flag = 0;
            for ( int j = 0; j <  a.length - 1 - i; ++j) {
                if (a[j] > a[j + 1]) {
                    flag = 1;
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }  
            }  
            if (flag == 0) { //��һ�˱Ƚ�û�з��ͽ�����ʱ���ʾһ������
                break;  
            }  
        } 
        
        print(a);

    }  
      
    /* 
     * ð�������Ż��� 
     * ��һ��������¼�����һ������������λ�ã�����û�з����������Ѿ����� 
     * ���Կ��������ֵ����Ϊ��һ�αȽϽ�����λ�� 
     * */  

    
    
    
    
    
    
    
    
    
    
    
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
