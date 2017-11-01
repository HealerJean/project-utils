package com.hlj.synchronizedTest;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月31日 下午3:56:14 
 * 类说明 
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
        System.out.println("test开始..");  
        try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println("test结束..");  
    	
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
  
