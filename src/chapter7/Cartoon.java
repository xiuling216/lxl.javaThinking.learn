package chapter7;

/**
 * ����̳й�ϵ�Ĺ������ƣ��������̴ӻ��࿪ʼ�����⡱��ɢ
 */
class A {
	A() {
		System.out.println("A constructor");
	}
}

class B extends A {
	B() {
		System.out.println("B constructor");
	}
}

public class Cartoon extends B {
	Cartoon() {
		System.out.println("cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon c = new Cartoon();
	}

}
