package com.hlj.synchronizedTest;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��31�� ����3:56:14 
 * ��˵�� 
 */
public class ThreeForTwoMain {  
	  
    public static void main(String[] args) {  
    	ThreeTeoSync threeTeoSync = new ThreeTeoSync();

        for (int i = 0; i < 3; i++) {  
        	ThreeTwoMyThread thread = new ThreeTwoMyThread(threeTeoSync);  
            thread.start();  
        }  
    }  
}

class ThreeTeoSync {  
	  
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
  
class ThreeTwoMyThread extends Thread {  
	
	public ThreeTeoSync threeTeoSync;
	
	public ThreeTwoMyThread(ThreeTeoSync threeTeoSync){
		this.threeTeoSync = threeTeoSync;
	}
    public void run() {  
    	threeTeoSync.test();  
    }  
}  
  
