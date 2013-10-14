package chapter13;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @echo 2013-10-14
 * 
 */
public class Turtle {
	private String name;
	private Formatter f;

	public Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}

	public void move(int x, int y) {
		f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
	}

	public static void main(String[] args) {
		PrintStream out=System.out;//???OutputStream输出到哪里了哟
		Turtle t=new Turtle("Tommy", new Formatter(out));
		t.move(1, 2);
		
		Turtle t2=new Turtle("echo", new Formatter(System.out));
		t2.move(3, 4);
	}

}
