package chapter9;

/**
 * @echo 2013-8-7
 * Ƕ�׽ӿ�
 */
class A {
	interface B {
		void f();
	}

	public class BImp implements B {
		public void f() {
		}
	}

	private class BImp2 implements B {
		public void f() {
		}
	}

	public interface C {
		void f();
	}

	class CImp implements C {
		public void f() {
		}
	}

	private class CImp2 implements C {
		public void f() {
		}
	}

	private interface D {
		void f();
	}

	private class DImp implements D {
		public void f() {
		}
	}

	public class DImp2 implements D {
		public void f() {
		}
	}

	public D getD() {
		return new DImp2();
	}

	private D dRef;

	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}

	public interface H {
		void f();
	}

	void g();
	// cannot be private within an interface
	// private interface I{}
}

public class NestingInterfaces {
	public class BImp implements A.B {
		public void f() {
		}
	}

	class CImp implements A.C {
		public void f() {
		}
	}

	/*
	 * private�ӿڲ����ڶ���������֮�ⱻʵ�� class DImp implements A.D{ public void f(){} }
	 */

	/*
	 * ˵��ʵ��ĳ���ӿ�ʱ��������Ҫʵ��Ƕ�������ڵ��κνӿ�
	 */
	class EImp implements E {
		public void g() {
		}
	}

	class EGImp implements E.G {
		public void f() {
		}
	}

	class EImp2 implements E {
		public void g() {
		}

		class EG implements E.G {
			public void f() {
			}
		}
	}

	public static void main(String[] args) {
		A a = new A();
		// A.D ad=a.getD();
		// A.DImp2 DI2=a.getD();
		// a.getD().f();
		A a2 = new A();
		a2.receiveD(a.getD());
	}

}
