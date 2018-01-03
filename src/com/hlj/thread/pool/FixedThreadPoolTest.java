package com.hlj.thread.pool;

import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月20日 下午6:14:55 
 * @Description:
 */
public class FixedThreadPoolTest {
	/**
	 * 2、创建一个固定数目的、可重用的线程池。可控制现场最大并发数，超出的线程会在线程队列中等待
	 */
	@Test
	public void newFixedThreadPoolTest() throws InterruptedException {
		// 固定线程的数量
		ExecutorService m = Executors.newFixedThreadPool(4);
		for (int i = 1; i <= 10; i++) {
			final int count = i;
			m.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println("线程：" + Thread.currentThread() + "负责了"
							+ count + "任务");
				}
			});
			Thread.sleep(1000);
		}
	}
}
