package codeFromWeb;

/**
 * @echo 2014-3-28
 * 一个计数器，计数到100，在每个数字之间暂停1秒，每隔10个数字输出一个字符串
 */
public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				System.out.println("-------" + i);
			}
			System.out.print(i);
			try {
				Thread.sleep(1);
				System.out.println(" 线程睡眠1毫秒!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t=new MyThread();
		t.setPriority(MIN_PRIORITY);
		System.out.println("线程的优先级："+t.getPriority());
		Thread d=new MyThread();
	
		t.start();
		t.join();
		d.start();
		
		
//		new MyThread().start();
	}
}
