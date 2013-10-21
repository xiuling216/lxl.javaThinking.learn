package chapter13;

import java.util.Arrays;

/**
 * @echo  2013-10-21
 *
 */
public class Splitting {
	public static String knights="Then, when you have foun the adb sherren, you must lala!";
	public static void split(String regex){
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");
		split("\\W+");//非词字符，本例中的，
		split("n\\W+");//n与非词字符，词字符指【a-zA-Z0-9】
	}
}
