package com.hlj.synchronizedTest;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月31日 下午3:56:14 
 * 类说明 
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
  
class FourMyThread extends Thread {  
  
    public void run() {  
    	FourSync sync = new FourSync();  
        sync.test();  
    }  
}  
  
