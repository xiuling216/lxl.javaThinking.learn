/**
 * @echo  2014-3-28
 *
 */
package codeFromWeb;

/**
 * 实现Runnable接口的类
 * 
 * @author leizhimin 2008-9-13 18:12:10
 */
class DoSomething2 implements Runnable {
	private String name;

	public DoSomething2(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			// for (long k = 0; k < 900000000; k++)
			// ;
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + ": " + i);
		}
	}
}