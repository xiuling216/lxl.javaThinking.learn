package chapter7;

/**
 * 初始化及类的加载顺序：顺序如下
 * 1.基类的static变量
 * 2.导出类的static变量
 * 3.基类的变量
 * 4.基类的构造函数
 * 5.导出类的变量
 * 6.导出类的构造函数
 */
class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		System.out.println("i = " + i + ",j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1.initialized");

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");

	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	private static int x2 = printInit("static Beetle.x2 initialized");

	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		Beetle b = new Beetle();
	}
}
