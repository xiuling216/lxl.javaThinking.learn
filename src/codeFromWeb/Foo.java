package codeFromWeb;

/**
 * @echo 2014-3-28
 * 
 */
public class Foo {
	private int x = 100;

	public  int getX() {
		return x;
	}

	public int  fix(int y) {
		x = x - y;
		return x;
	}
}