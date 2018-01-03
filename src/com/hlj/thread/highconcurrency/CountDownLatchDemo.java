package com.hlj.thread.highconcurrency;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 13 on 2017/5/5.
 */
public class CountDownLatchDemo implements Runnable {
	//��������Ϊ10����ʾ��Ҫ��10���߳��������ȴ���CountDownLatch �ϵ��̲߳���ִ��
    static final CountDownLatch end = new CountDownLatch(10); 
    static final CountDownLatchDemo demo = new CountDownLatchDemo();

    @Override
    public void run() {

        try {
        	System.out.println(Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(3) * 1000);
            System.out.println("check complete");
            end.countDown(); //֪ͨCountDownLatch һ���߳��Ѿ���������� ����ʱ���Լ�һ��
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(demo);
        }
        //�ȴ����
        end.await(); //Ҫ�����̵߳ȴ����е�10���������ȫ����ɣ����̲߳��ܼ�������
        //������
        System.out.println("Fire!");
        executorService.shutdown();
    }
}
