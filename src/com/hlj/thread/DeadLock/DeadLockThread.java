package com.hlj.thread.DeadLock;
/** 
�߳�thread1ռ����ԴobjectA���߳�thread2ռ����ԴobjectB��
�������̷߳�������ʱ���������������Դ���ڶԷ����У��Ӷ������߳�������������̵߳�������
 */
public class DeadLockThread implements Runnable {
    private static final Object objectA = new Object();
    private static final Object objectB = new Object();
    private boolean flag;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("��ǰ�߳� Ϊ��" + threadName + "\tflag = " + flag);
        if (flag) {
            synchronized (objectA) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(threadName + "�ѽ���ͬ�������objectA��׼������objectB");
                synchronized (objectB) {
                    System.out.println(threadName + "�Ѿ�����ͬ�������objectB");
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
                System.out.println(threadName + "�ѽ���ͬ�������objectB��׼������objectA");
                synchronized (objectA) {
                    System.out.println(threadName + "�Ѿ�����ͬ�������objectA");
                    
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