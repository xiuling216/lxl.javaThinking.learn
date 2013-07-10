package chapter3;

/**
 * 移位运算符
 */
public class URShift {

	public static void main(String[] args) {
		System.out.println(3 << 2);// 3左移2位
		System.out.println(-3 << 2);// -3左移2位
		System.out.println(6 >> 2);// 6右移2位
		System.out.println(-6 >> 2);// -6右移2位
		System.out.println(6 >>> 2);// 6无符号右移2位
		System.out.println(-6 >>> 2);// -6无符号右移2位

	}
}
