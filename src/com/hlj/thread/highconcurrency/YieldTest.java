package com.hlj.thread.highconcurrency;
/** 
 * @author : HealerJean
 * @date   �� 2018��1��2�� ����1:47:38 
 * @Description:
 */
public class YieldTest extends Thread {  
	  
    public YieldTest(String name) {  
        super(name);  
    }  
  
    @Override  
    public void run() {  
        for (int i = 1; i <= 10; i++) {  
            System.out.println("" + this.getName() + "-----" + i);  
            // ��iΪ30ʱ�����߳̾ͻ��CPUʱ���õ��������������Լ����߳�ִ�У�Ҳ����˭������˭ִ�У�  
            if (i == 5) {  
            	Thread.yield();  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
        YieldTest yt1 = new YieldTest("����");  
        YieldTest yt2 = new YieldTest("����");  
        yt1.start();  
        yt2.start();  
    }  
}  
