package com.hlj.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.junit.Test;
  
/** 
 * @author : HealerJean
 * @date   �� 2017��12��20�� ����4:58:19 
 * @Description:
 */

public class CallableTest {   

  /**
   * 
   	1�������̵߳ĵ�һ�ַ���
   */ 
	@Test
	public void testStart() throws InterruptedException, ExecutionException{
		
	        Callable<String> callable = new CallableTaskWithResult(45);
	        
	        
	        FutureTask<String> task = new FutureTask<String>(callable);
	        
	        new Thread(task).start();
	        
	        String result = task.get(); 
	        
	        System.out.println(result); 
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

}