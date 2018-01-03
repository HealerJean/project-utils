package com.hlj.thread.highconcurrency;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 13 on 2017/5/5.
 */
public class CountDownLatchDemo implements Runnable {
	//计数数量为10，表示需要有10个线程完成任务等待在CountDownLatch 上的线程才能执行
    static final CountDownLatch end = new CountDownLatch(10); 
    static final CountDownLatchDemo demo = new CountDownLatchDemo();

    @Override
    public void run() {

        try {
        	System.out.println(Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(3) * 1000);
            System.out.println("check complete");
            end.countDown(); //通知CountDownLatch 一个线程已经完成了任务 倒计时可以减一了
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(demo);
        }
        //等待检查
        end.await(); //要求主线程等待所有的10个检查任务全部完成，主线程才能继续运行
        //发射火箭
        System.out.println("Fire!");
        executorService.shutdown();
    }
}
