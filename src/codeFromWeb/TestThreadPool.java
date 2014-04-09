package codeFromWeb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @echo 2014-4-9 Java�̣߳��̳߳�
 */
public class TestThreadPool {
	public static void main(String[] args) {
		// ����һ�������ù̶��߳������̳߳�
		// ExecutorService pool = Executors.newFixedThreadPool(2);
		// ����һ��ʹ�õ��� worker �̵߳� Executor�����޽���з�ʽ�����и��̡߳�
		// ExecutorService pool = Executors.newSingleThreadExecutor();
		// ����һ���ɸ�����Ҫ�������̵߳��̳߳أ���������ǰ������߳̿���ʱ���������ǡ�
		ExecutorService pool = Executors.newCachedThreadPool();
		Thread t1 = new MyThread7();
		Thread t2 = new MyThread7();
		Thread t3 = new MyThread7();
		Thread t4 = new MyThread7();
		Thread t5 = new MyThread7();
		// ���̷߳�����н���ִ��
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		// �ر��̳߳�
		pool.shutdown();
	}
}

class MyThread7 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "����ִ���С�������");
	}
}
