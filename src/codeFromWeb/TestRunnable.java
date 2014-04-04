package codeFromWeb;

/**
 * 测试Runnable类实现的多线程程序
 * 
 * @author leizhimin 2008-9-13 18:15:02
 */
public class TestRunnable {
	public static void main(String[] args) {
		DoSomething ds1 = new DoSomething("阿三");
		DoSomething2 ds2 = new DoSomething2("李四");

		Thread t1 = new Thread(ds1);
		Thread t2 = new Thread(ds2);

		t1.start();
		t2.start();
	}
}