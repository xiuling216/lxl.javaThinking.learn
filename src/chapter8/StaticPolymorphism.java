package chapter8;

/**
 * 静态方法不具有多态性
 */
class StaticSuper {
	public static String StaticGet() {
		return "Base staticGet()";
	}

	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String StaticGet() {
		return "Derived staticGet()";
	}

	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		System.out.println(sup.StaticGet());
		System.out.println(sup.dynamicGet());
	}
}
