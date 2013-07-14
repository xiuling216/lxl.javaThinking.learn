package chapter5;

/**
 * 可变参数列表使重载变复杂
 */
public class OverloadVargs {
	
	static void f(Character... args) {
		System.out.print("first");
		for (Character c : args)
			System.out.print(" " + c);
		System.out.println();
	}
	
	static void f(Integer... args) {
		System.out.print("second");
		for (Integer i : args)
			System.out.print(" " + i);
		System.out.println();
	}
	
	static void f(Long... args) {
		System.out.print("Third");
	}
	
	public static void main(String[] args) {
		f('a','b','c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
		//f();
	}

}
