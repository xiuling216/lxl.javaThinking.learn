package codeFromWeb;

/**
 * @echo 2014-3-28
 * 
 */
public class TestThread extends Thread {
	public TestThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			for (long k = 0; k < 100000000; k++);
			System.out.println(this.getName() + " :" + i);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new TestThread("°¢Èý");
		Thread t2 = new TestThread("ÀîËÄ");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread());
	}

}
