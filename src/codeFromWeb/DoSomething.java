/**
 * @echo  2014-3-28
 *
 */
package codeFromWeb;

/**
 * ʵ��Runnable�ӿڵ���
 * 
 * @author leizhimin 2008-9-13 18:12:10
 */
class DoSomething implements Runnable {
	private String name;

	public DoSomething(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			for (long k = 0; k < 900000000; k++)
				;
			System.out.println(name + ": " + i);
		}
	}
}