package chapter8;

/**
 * 构造函数的调用顺序
 */
class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class ProtableLunch extends Lunch {
	ProtableLunch() {
		System.out.println("ProtableLunch()");
	}
}

public class SandWich extends ProtableLunch {
	private static Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	SandWich() {
		System.out.println("SandWich()");
	}

	public static void main(String[] args) {
		new SandWich();
	}
}
