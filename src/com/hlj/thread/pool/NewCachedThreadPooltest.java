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
 * @date   ： 2017年12月20日 下午5:54:51 
 * @Description:
 */
public class NewCachedThreadPooltest {


	/**
	 * 
		2、线程池调用
		创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
		就是一次添加多个任务，长度会变大，会一直新建线程，
		当没有任务时，空闲线程会被回收
		线程池为无限大，当执行第二个任务时第一个任务已经完成。会复用第一个任务的线程，而不是每次新建线程。

	 */
	@Test
	public void testCallSubmit(){

        ExecutorService exec=Executors.newCachedThreadPool();  
        
        List<Future<String>> results=new ArrayList<Future<String>>();  
          
        for(int i=0;i<10;i++) {  
        	
            results.add(exec.submit(new CallableTaskWithResult(i)));  
        }  
        //关闭线程池  
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
        //关闭线程池  
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
		return "id为："+id;
	}  
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); 

	}
} 

}
