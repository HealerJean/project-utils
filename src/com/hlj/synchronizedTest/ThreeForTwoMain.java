package com.hlj.synchronizedTest;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月31日 下午3:56:14 
 * 类说明 
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
	        System.out.println("test开始..");  
	        try {  
	            Thread.sleep(1000);  
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }  
	        System.out.println("test结束..");  
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
  
