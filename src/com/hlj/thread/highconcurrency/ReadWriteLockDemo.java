package com.hlj.thread.highconcurrency;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by 13 on 2017/5/5.
 */
public class ReadWriteLockDemo {
    private static Lock lock = new ReentrantLock();
    private static ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    private static Lock readLock = reentrantReadWriteLock.readLock();
    private static Lock writeLock = reentrantReadWriteLock.writeLock();
    private int value;

    public Object handleRead(Lock lock) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1000);//ģ�������
            System.out.println("������:" + value);
            return value;
        } finally {
            lock.unlock();
        }
    }

    public void handleWrite(Lock lock, int index) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(1000);//ģ��д����
            System.out.println("д����:" + value);
            value = index;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String args[]) {
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();

        Runnable readRunnable = new Runnable() {
            @Override
            public void run() {
                //�ֱ�ʹ��������������,���ܲ���ֱ�۵ľ����ֳ���,ʹ�ö�д������������Բ���,��ʡ�˴���ʱ��
                try {
                    demo.handleRead(readLock);
                    //demo.handleRead(lock);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable writeRunnable = new Runnable() {
            @Override
            public void run() {
                //�ֱ�ʹ��������������,���ܲ���ֱ�۵ľ����ֳ���
                try {
                    demo.handleWrite(writeLock, new Random().nextInt(100));
                    //demo.handleWrite(lock, new Random().nextInt(100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        for (int i = 0; i < 18; i++) {
            new Thread(readRunnable).start();
        }
        for (int i = 18; i < 20; i++) {
            new Thread(writeRunnable).start();
        }
    }
}
