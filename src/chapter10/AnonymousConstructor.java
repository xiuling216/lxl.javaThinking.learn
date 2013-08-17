package chapter10;

/**
 * @echo 2013-8-17 �����ڲ��� ������
 */
abstract class Base {
	public Base(int i) {
		System.out.println("Base constructor,i = " + i);
	}

	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			//��������Ч��
			{
				System.out.println("Inside instance initializer");
			}

			public void f() {
				System.out.println("In anonymous f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base=getBase(47);
		base.f();
	}

}
