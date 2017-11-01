package com.hlj.synchronizedTest;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��31�� ����3:56:14 
 * ��˵�� 
 */
public class FourNewMain {  
	  
    public static void main(String[] args) {  
        for (int i = 0; i < 3; i++) {  
        	FourMyThread thread = new FourMyThread();  
            thread.start();  
        }  
    }  
}

class FourSync {  
	  
    public  void test() {  

    	synchronized(FourNewMain.class){
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
  
class FourMyThread extends Thread {  
  
    public void run() {  
    	FourSync sync = new FourSync();  
        sync.test();  
    }  
}  
  
