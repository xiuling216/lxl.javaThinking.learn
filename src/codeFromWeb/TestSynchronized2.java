package codeFromWeb;

/**
 * @echo 2014-4-9
 * 
 */
public class TestSynchronized2 {
	public static void main(String[] args) {
		DeadlockRisk2 dead = new DeadlockRisk2();
		MyThread6 t1 = new MyThread6(dead, 1, 2);
		MyThread6 t2 = new MyThread6(dead, 3, 4);
		MyThread6 t3 = new MyThread6(dead, 5, 6);
		MyThread6 t4 = new MyThread6(dead, 7, 8);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class MyThread6 extends Thread {
	private DeadlockRisk2 dead;
	private int a, b;

	MyThread6(DeadlockRisk2 dead, int a, int b) {
		this.dead = dead;
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		dead.read();
		dead.write(a, b);
	}
}

class DeadlockRisk2 {
	private static class Resource {
		public int value;
	}

	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();

	public int read() {
		synchronized (resourceA) {
			System.out.println("read():" + Thread.currentThread().getName()
					+ "获取了resourceA的锁！");
			synchronized (resourceB) {
				System.out.println("read():" + Thread.currentThread().getName()
						+ "获取了resourceB的锁！");
				return resourceB.value + resourceA.value;
			}
		}
	}

	public void write(int a, int b) {
		synchronized (resourceB) {
			System.out.println("write():" + Thread.currentThread().getName()
					+ "获取了resourceB的锁！");
			synchronized (resourceA) {
				System.out.println("write():"
						+ Thread.currentThread().getName() + "获取了resourceA的锁！");
				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}
}