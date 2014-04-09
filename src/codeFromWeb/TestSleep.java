package codeFromWeb;

/**
 * @echo 2014-4-4
 * 
 */
public class TestSleep {

	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new Thread(new MyRunnable1());
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("线程1第" + i + "次执行！");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("线程2第" + i + "次执行！");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}