package com.hlj.thread.highconcurrency;

/**
 * Created by 13 on 2017/5/4.
 */
public class ThreadGroupName implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        String groupAndName = Thread.currentThread().getThreadGroup().getName() + "-" + Thread.currentThread().getName();
        while (true) {
            System.out.println("I am " + groupAndName);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        ThreadGroup tg = new ThreadGroup("PrintGroup");
        Thread t1 = new Thread(tg, new ThreadGroupName(), "T1");
        Thread t2 = new Thread(tg, new ThreadGroupName(), "T2");
        t1.start();
        t2.start();
        System.out.println("获得活动线程的总数"+tg.activeCount()); //获得活动线程的总数
        Thread t3 = new Thread(tg, new ThreadGroupName(), "T3");
        t3.start();
        System.out.println("获得活动线程的总数"+tg.activeCount());
        tg.list(); //打印这个线程组中 所有的线程信息，对于调试有一定的帮助，
    }
}
