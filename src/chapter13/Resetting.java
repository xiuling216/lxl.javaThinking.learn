package chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @echo 2013-10-21
 * 
 */
public class Resetting {

	public static void main(String[] args) {
		Matcher m = Pattern.compile("[frb][aiu][gx]").matcher(
				"fix the rug with bags");
		while (m.find())
			System.out.print(m.group() + " ");
		System.out.println();
		m.reset("fix the rig with rags");
		while (m.find())
			System.out.print(m.group() + " ");
	}

}
