package codeFromWeb;

/**
 * @echo 2014-4-4
 * 
 */
public class TestYield {

	public static void main(String[] args) {
		Thread t1 = new MyThread3();
		Thread t2 = new Thread(new MyRunnable3());
		t2.start();
		t1.start();
	}
}

class MyThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�1��" + i + "��ִ�У�");
		}
	}
}

class MyRunnable3 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�2��" + i + "��ִ�У�");
			Thread.yield();
		}
	}
}