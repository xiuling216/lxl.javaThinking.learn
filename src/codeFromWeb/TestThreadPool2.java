package codeFromWeb;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @echo 2014-4-9 Java�̣߳��̳߳�-�Զ����̳߳�
 */
public class TestThreadPool2 {
	public static void main(String[] args) {
		// �����ȴ�����
		BlockingQueue<Runnable> bqueue = new ArrayBlockingQueue<Runnable>(20);
		// ����һ�����߳�ִ�г������ɰ����ڸ����ӳٺ�����������߶��ڵ�ִ�С�
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 2,
				TimeUnit.MILLISECONDS, bqueue);
		Thread t1 = new MyThread8();
		Thread t2 = new MyThread8();
		Thread t3 = new MyThread8();
		Thread t4 = new MyThread8();
		Thread t5 = new MyThread8();
		Thread t6 = new MyThread8();
		Thread t7 = new MyThread8();
		// ���̷߳�����н���ִ��
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		pool.execute(t6);
		pool.execute(t7);
		// �ر��̳߳�
		pool.shutdown();
	}
}

class MyThread8 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + "����ִ���С�������");
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
