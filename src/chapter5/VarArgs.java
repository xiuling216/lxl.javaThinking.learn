package chapter5;

/**
 * 以object数组为参数的方法实现可变参数列表
 */
class A {
}

public class VarArgs {
	static void printArray(Object[] args) {
		for (Object obj : args)
			System.out.print(obj + "   ");
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Object[] { new Integer(55), new Float(5.34),
				new Double(3.56) });
		printArray(new Object[] { "one", "two", "three" });
		printArray(new Object[] { new A(), new A(), new A() });
	}
}
