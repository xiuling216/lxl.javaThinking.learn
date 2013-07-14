package chapter5;

/**
 * 可变参数列表
 */
public class NewVarArgs {
	static void printArray(Object... args) {
		for (Object obj : args)
			System.out.print(obj + "  ");
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Integer(33), new Float(5.23), new Double(3.55));
		printArray(33,5.23f,3.55d);
		printArray("one","two","three");
		printArray(new A(),new A(),new A());
		printArray((Object[])new Integer[]{1,2,3,4,5,6});
		printArray();
	}

}
