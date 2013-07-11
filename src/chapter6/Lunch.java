package chapter6;

/**
 * 
 */
class Soup1 {
	private Soup1() {
	}

	public static Soup1 makeup() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {
	}

	private static Soup2 ps1 = new Soup2();

	public static Soup2 access() {
		return ps1;
	}

	public void f() {
		System.out.println("do something");
	}
}

public class Lunch {
	void testPrivate() {
		// Soup1 soup = new Soup1();private类型的构造函数，不能这样实例化
	}

	void testStatic() {
		Soup1 soup = Soup1.makeup();
	}

	static void testSingleton() {
		Soup2.access().f();
	}

	public static void main(String[] args) {
		testSingleton();
	}

}
