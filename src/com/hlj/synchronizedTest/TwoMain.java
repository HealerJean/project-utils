package com.hlj.synchronizedTest;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��31�� ����3:56:14 
 * ��˵�� 
 */
public class TwoMain {  
	  
    public static void main(String[] args) {  
        for (int i = 0; i < 3; i++) {  
        	TwoMyThread thread = new TwoMyThread();  
            thread.start();  
        }  
    }  
}

class TeoSync {  
	  
    public  void test() {  
    	synchronized(this){
	        System.out.println("test��ʼ..");  
	        try {  
	            Thread.sleep(1000);  
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }  
	        System.out.println("test����..");  
    	}
    }  
}  
  
class TwoMyThread extends Thread {  
  
    public void run() {  
    	TeoSync sync = new TeoSync();  
        sync.test();  
    }  
}  
  
