package codeFromWeb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @echo 2014-4-9 Java线程：线程池
 */
public class TestThreadPool {
	public static void main(String[] args) {
		// 创建一个可重用固定线程数的线程池
		// ExecutorService pool = Executors.newFixedThreadPool(2);
		// 创建一个使用单个 worker 线程的 Executor，以无界队列方式来运行该线程。
		// ExecutorService pool = Executors.newSingleThreadExecutor();
		// 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
		ExecutorService pool = Executors.newCachedThreadPool();
		Thread t1 = new MyThread7();
		Thread t2 = new MyThread7();
		Thread t3 = new MyThread7();
		Thread t4 = new MyThread7();
		Thread t5 = new MyThread7();
		// 将线程放入池中进行执行
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		// 关闭线程池
		pool.shutdown();
	}
}

class MyThread7 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "正在执行中。。。。");
	}
}
