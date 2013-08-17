package chapter7;

class WithFinal {
	private final void f() {
		System.out.println("WithFinal f()");
	}

	private final void g() {
		System.out.println("WithFinal g()");
	}
}

class OverridingPrivate extends WithFinal {
	private final void f() {
		System.out.println("OverridingPrivate f()");
	}

	private final void g() {
		System.out.println("OverridingPrivate g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2 f()");
	}

	public final void g() {
		System.out.println("OverridingPrivate2 g()");
	}
}

public class FinalOverridIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
		// !op.f();
		// !o2.g();
		WithFinal wf = op2;
		// !wf.f();
		// !wf.g();
	}
}
