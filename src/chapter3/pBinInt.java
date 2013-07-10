package chapter3;

//: BitManipulation.java
//Using the bitwise operators
import java.util.*;

public class pBinInt {
	/**
	 * 打印整数对应二进制代码(java编程思想中方法，不太明白)
	 * 
	 * @param s
	 *            说明打印什么
	 * @param i
	 *            打印的整数
	 */
	public static void pBinIntA(String s, int i) {
		System.out.println(s + ", int: " + i + ", binary: ");
		System.out.print(" ");
		for (int j = 31; j >= 0; j--)
			if (((1 << j) & i) != 0)
				System.out.print("1");
			else
				System.out.print("0");
		System.out.println();
	}

	/**
	 * 打印整数对应二进制代码
	 * 
	 * @param s
	 *            说明打印什么
	 * @param i
	 *            打印的整数
	 */
	public static void pBinInt(String s, int i) {
		System.out.println(s + ", int: " + i + ", binary: ");
		String b = Integer.toBinaryString(i);
		String bin = "";
		for (int j = 31 - b.length(); j >= 0; j--)
			bin += 0;
		bin += b;
		System.out.println(bin);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt();
		int j = rand.nextInt();
		pBinInt("-1", -1);
		pBinInt("+1", +1);
		int maxpos = 2147483647;
		pBinInt("maxpos", maxpos);
		int maxneg = -2147483648;
		pBinInt("maxneg", maxneg);
		pBinInt("i", i);
		pBinInt("~i", ~i);
		pBinInt("-i", -i);
		pBinInt("j", j);
		pBinInt("i & j", i & j);
		pBinInt("i | j", i | j);
		pBinInt("i ^ j", i ^ j);
		pBinInt("i << 5", i << 5);
		pBinInt("i >> 5", i >> 5);
		pBinInt("(~i) >> 5", (~i) >> 5);
		pBinInt("i >>> 5", i >>> 5);
		pBinInt("(~i) >>> 5", (~i) >>> 5);
		long l = rand.nextLong();
		long m = rand.nextLong();
		pBinLong("-1L", -1L);
		pBinLong("+1L", +1L);

		long ll = 9223372036854775807L;
		pBinLong("maxpos", ll);
		long lln = -9223372036854775808L;
		pBinLong("maxneg", lln);
		pBinLong("l", l);
		pBinLong("~l", ~l);
		pBinLong("-l", -l);
		pBinLong("m", m);
		pBinLong("l & m", l & m);
		pBinLong("l | m", l | m);
		pBinLong("l ^ m", l ^ m);
		pBinLong("l << 5", l << 5);
		pBinLong("l >> 5", l >> 5);
		pBinLong("(~l) >> 5", (~l) >> 5);
		pBinLong("l >>> 5", l >>> 5);
		pBinLong("(~l) >>> 5", (~l) >>> 5);
	}

	static void pBinLong(String s, long l) {
		System.out.println(s + ", long: " + l + ", binary: ");
		System.out.print(" ");
		for (int i = 63; i >= 0; i--)
			if (((1L << i) & l) != 0)
				System.out.print("1");
			else
				System.out.print("0");
		System.out.println();
	}
} // /:~