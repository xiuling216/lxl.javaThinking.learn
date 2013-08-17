package chapter8;

/**
 * @echo 2013-8-1 向下转型
 */
class Useful {
	public void f() {
	}

	public void g() {
	}
}

class MoreUseful extends Useful {
	public void f() {
	}

	public void g() {
	}

	public void u() {
	}

	public void v() {
	}

	public void w() {
	}
}

public class RTTI {
	public static void main(String[] args) {
		Useful[] x = { new Useful(), new MoreUseful() };
		x[0].f();
		x[1].g();
		//x[1].u();
		((MoreUseful) x[1]).u();// 向下转型
		((MoreUseful) x[0]).u();// excetion thrown
	}

}
