package com.hlj.thread.DeadLock;
/** 
线程thread1占有资源objectA，线程thread2占有资源objectB，
当两个线程发出请求时，由于所请求的资源都在对方手中，从而发生线程阻塞，造成了线程的死锁。
 */
public class DeadLockThread implements Runnable {
    private static final Object objectA = new Object();
    private static final Object objectB = new Object();
    private boolean flag;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("当前线程 为：" + threadName + "\tflag = " + flag);
        if (flag) {
            synchronized (objectA) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(threadName + "已进入同步代码块objectA，准备进入objectB");
                synchronized (objectB) {
                    System.out.println(threadName + "已经进入同步代码块objectB");
                }
            }

        } else {
            synchronized (objectB) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(threadName + "已进入同步代码块objectB，准备进入objectA");
                synchronized (objectA) {
                    System.out.println(threadName + "已经进入同步代码块objectA");
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLockThread deadlock1 = new DeadLockThread();
        DeadLockThread deadlock2 = new DeadLockThread();
        deadlock1.flag = true;
        deadlock2.flag = false;
        Thread thread1 = new Thread(deadlock1);
        Thread thread2 = new Thread(deadlock2);
        thread1.start();
        thread2.start();

    }

}