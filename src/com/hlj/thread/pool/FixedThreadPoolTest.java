package com.hlj.thread.pool;

import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��20�� ����6:14:55 
 * @Description:
 */
public class FixedThreadPoolTest {
	/**
	 * 2������һ���̶���Ŀ�ġ������õ��̳߳ء��ɿ����ֳ���󲢷������������̻߳����̶߳����еȴ�
	 */
	@Test
	public void newFixedThreadPoolTest() throws InterruptedException {
		// �̶��̵߳�����
		ExecutorService m = Executors.newFixedThreadPool(4);
		for (int i = 1; i <= 10; i++) {
			final int count = i;
			m.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println("�̣߳�" + Thread.currentThread() + "������"
							+ count + "����");
				}
			});
			Thread.sleep(1000);
		}
	}
}
