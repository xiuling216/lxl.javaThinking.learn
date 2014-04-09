package codeFromWeb;

/**
 * @echo 2014-4-9 Java线程：线程的同步
 */
public class TestSynchronized {

	public static void main(String[] args) {
		User u = new User("张三", 100);
		MyThread5 t1 = new MyThread5("线程A", u, 20);
		MyThread5 t2 = new MyThread5("线程B", u, -60);
		MyThread5 t3 = new MyThread5("线程C", u, -80);
		MyThread5 t4 = new MyThread5("线程D", u, -30);
		MyThread5 t5 = new MyThread5("线程E", u, 32);
		MyThread5 t6 = new MyThread5("线程F", u, 21);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}

class MyThread5 extends Thread {
	private User u;
	private int y = 0;

	MyThread5(String name, User u, int y) {
		super(name);
		this.u = u;
		this.y = y;
	}

	public void run() {
		u.oper(y);
	}
}

class User {
	private String code;
	private int cash;

	User(String code, int cash) {
		this.code = code;
		this.cash = cash;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public synchronized void oper(int x) {
		try {
			Thread.sleep(10L);
			this.cash += x;
			System.out.println(Thread.currentThread().getName() + "运行结束，增加“"
					+ x + "”，前用户账户余额为：" + cash);
			Thread.sleep(10L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return "User{" + "code='" + code + '\'' + ", cash=" + cash + '}';
	}
}