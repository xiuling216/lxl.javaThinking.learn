package chapter13;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

/**
 * @echo  2013-10-23
 *
 */
public class BetterRead {
	public static BufferedReader input=new BufferedReader(new StringReader("" +
			"Sir Robin of Camelot\n22 1.34343"));
	public static void main(String[] args) {
		Scanner stdin=new Scanner(input);
		System.out.println("what is your name?");
		String name=stdin.nextLine();
		System.out.println(name);
		System.out.println("how old are you?what is your favoriable double?");
		System.out.println("(input:<age><double)");
		int age=stdin.nextInt();
		double fa=stdin.nextDouble();
		System.out.println(age);
		System.out.println(fa);
		System.out.format("Hi %s\n",name);
		System.out.format("In 5 years you will be %d\n", age+5);
		System.out.format("your favorite double is %f\n",fa/2);
	}

}
