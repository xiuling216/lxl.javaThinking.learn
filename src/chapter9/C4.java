package chapter9;

/**
 * @echo 2013-8-6
 * 组合接口时的名字冲突
 */
interface I1 {
	void f();
}

interface I2 {
	int f(int i);
}

interface I3 {
	int f();
}

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {
	public void f() {
	}

	public int f(int i) {
		return 1;
	}
}

class C3 extends C implements I2 {
	public int f(int i) {
		return 1;
	}
}

public class C4 {
	public int f() {
		return 1;
	}
}

//class C5 extends C implements I1{	}
//interface I4 extends I1,I3{}