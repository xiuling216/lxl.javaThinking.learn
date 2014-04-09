package codeFromWeb;

/**
 * @echo 2014-4-4
 * 
 */
public class TestPriority {
	public static void main(String[] args) {
		Thread t1 = new MyThread2();
		Thread t2 = new Thread(new MyRunnable2());
		t1.setPriority(10);
		t2.setPriority(1);

		t2.start();
		t1.start();
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�1��" + i + "��ִ�У�");
		}
	}
}

class MyRunnable2 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�2��" + i + "��ִ�У�");
		}
	}
}
