package com.hlj.synchronizedTest;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��31�� ����3:56:14 
 * ��˵�� 
 */
public class ThreeForOneMain {  
	  
    public static void main(String[] args) {  
    	ThreeOneSync threeTeoSync = new ThreeOneSync();

        for (int i = 0; i < 3; i++) {  
        	ThreeOneMyThread thread = new ThreeOneMyThread(threeTeoSync);  
            thread.start();  
        }  
    }  
}

class ThreeOneSync {  
	  
    public synchronized void test() {  
        System.out.println("test��ʼ..");  
        try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println("test����..");  
    	
    }  
}  
  
class ThreeOneMyThread extends Thread {  
	
	public ThreeOneSync threeTeoSync;
	
	public ThreeOneMyThread(ThreeOneSync threeTeoSync){
		this.threeTeoSync = threeTeoSync;
	}
    public void run() {  
    	threeTeoSync.test();  
    }  
}  
  
