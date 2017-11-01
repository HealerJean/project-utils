package com.hlj.synchronizedTest;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��31�� ����3:56:14 
 * ��˵�� 
 */
public class OneMain {  
	  
    public static void main(String[] args) {  
        for (int i = 0; i < 3; i++) {  
            Thread thread = new MyThread();  
            thread.start();  
        }  
    }  
}

class Sync {  
	  
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
  
class MyThread extends Thread {  
  
    public void run() {  
        Sync sync = new Sync();  
        sync.test();  
    }  
}  
  
