package codeFromWeb;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @echo 2014-4-9 Java线程：线程池-自定义线程池
 */
public class TestThreadPool2 {
	public static void main(String[] args) {
		// 创建等待队列
		BlockingQueue<Runnable> bqueue = new ArrayBlockingQueue<Runnable>(20);
		// 创建一个单线程执行程序，它可安排在给定延迟后运行命令或者定期地执行。
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 2,
				TimeUnit.MILLISECONDS, bqueue);
		Thread t1 = new MyThread8();
		Thread t2 = new MyThread8();
		Thread t3 = new MyThread8();
		Thread t4 = new MyThread8();
		Thread t5 = new MyThread8();
		Thread t6 = new MyThread8();
		Thread t7 = new MyThread8();
		// 将线程放入池中进行执行
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		pool.execute(t6);
		pool.execute(t7);
		// 关闭线程池
		pool.shutdown();
	}
}

class MyThread8 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "正在执行中。。。。");
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
