package com.hlj.thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;


/** 
 * @author : HealerJean
 * @date   �� 2017��12��20�� ����5:54:51 
 * @Description:
 */
public class NewCachedThreadPooltest {


	/**
	 * 
		2���̳߳ص���
		����һ���ɻ����̳߳أ�����̳߳س��ȳ���������Ҫ���������տ����̣߳����޿ɻ��գ����½��̡߳�
		����һ����Ӷ�����񣬳��Ȼ��󣬻�һֱ�½��̣߳�
		��û������ʱ�������̻߳ᱻ����
		�̳߳�Ϊ���޴󣬵�ִ�еڶ�������ʱ��һ�������Ѿ���ɡ��Ḵ�õ�һ��������̣߳�������ÿ���½��̡߳�

	 */
	@Test
	public void testCallSubmit(){

        ExecutorService exec=Executors.newCachedThreadPool();  
        
        List<Future<String>> results=new ArrayList<Future<String>>();  
          
        for(int i=0;i<10;i++) {  
        	
            results.add(exec.submit(new CallableTaskWithResult(i)));  
        }  
        //�ر��̳߳�  
        exec.shutdown();  

        for(Future<String> fs :results) {  
            try {  
                System.out.println(fs.get());  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            } catch (ExecutionException e) {  
                e.printStackTrace();  
            }  
        }  
        
	}
	
	

	
	@Test
	public void testRunnalbeSubmit(){

        ExecutorService exec=Executors.newCachedThreadPool();  
          
        for(int i=0;i<10;i++) {  
        	exec.submit(new MyRunnable());
        }  
        //�ر��̳߳�  
        exec.shutdown();  

        
	}
	
class CallableTaskWithResult implements Callable<String> {  
    private int id;  
    public CallableTaskWithResult(int id) {  
        this.id=id;  
    }
    
	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()); 
		return "idΪ��"+id;
	}  
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); 

	}
} 

}
