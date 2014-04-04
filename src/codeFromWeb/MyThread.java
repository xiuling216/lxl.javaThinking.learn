package codeFromWeb;

/**
 * @echo 2014-3-28
 * һ����������������100����ÿ������֮����ͣ1�룬ÿ��10���������һ���ַ���
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
				System.out.println(" �߳�˯��1����!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t=new MyThread();
		t.setPriority(MIN_PRIORITY);
		System.out.println("�̵߳����ȼ���"+t.getPriority());
		Thread d=new MyThread();
	
		t.start();
		t.join();
		d.start();
		
		
//		new MyThread().start();
	}
}
