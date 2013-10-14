package chapter13;

/**
 * @echo 2013-10-14
 * 格式化输出
 */
public class SimpleFormat {
	public static void main(String[] args) {
		int x = 5;
		double y = 4.232334;
		// old way
		System.out.println("Row 1: [" + x + " " + y + "]");
		// new way
		System.out.format("Row 1: [%d %f]\n", x, y);
		// or
		System.out.printf("Row 1: [%d %f]\n", x, y);
	}
}
