package chapter13;

import java.io.IOException;

import net.mindview.util.BinaryFile;

/**
 * @echo 2013-10-18 һ��ʮ������ת������
 */
public class Hex {
	public static String format(byte[] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if (n % 16 == 0)
				result.append(String.format("%05X: ", n));
			result.append(String.format("02X ", b));
			n++;
			if (n % 16 == 0)
				result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}

	public static void main(String[] args) throws Exception {
		if(args.length==0)
			System.out.println(format(BinaryFile.read("bin/chapter13/Hex.class")));
		else
			System.out.println(format(BinaryFile.read(args[0])));
	}

}
