package codeFromWeb;

/**
 * ����Runnable��ʵ�ֵĶ��̳߳���
 * 
 * @author leizhimin 2008-9-13 18:15:02
 */
public class TestRunnable {
	public static void main(String[] args) {
		DoSomething ds1 = new DoSomething("����");
		DoSomething2 ds2 = new DoSomething2("����");

		Thread t1 = new Thread(ds1);
		Thread t2 = new Thread(ds2);

		t1.start();
		t2.start();
	}
}