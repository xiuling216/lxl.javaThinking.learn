package chapter8;

/**
 * ����"����"˽�з���
 */
public class PrivateOverride {
	private void f() {
		System.out.println("private f()");
	}

	public static void main(String[] args) {
		PrivateOverride po=new Derived();
		po.f();
		Derived d=new Derived();
		d.f();
	}
}

class Derived extends PrivateOverride {
	public void f() {
		System.out.println("public f()");
	}
}
