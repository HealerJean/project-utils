package com.hlj.synchronizedTest;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月31日 下午3:56:14 
 * 类说明 
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
  
class TwoMyThread extends Thread {  
  
    public void run() {  
    	TeoSync sync = new TeoSync();  
        sync.test();  
    }  
}  
  
