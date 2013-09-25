package chapter11;

import java.util.Map;

/**
 * @echo 2013-9-25
 * 
 */
public class EnvironmentVariables {

	public static void main(String[] args) {
		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
