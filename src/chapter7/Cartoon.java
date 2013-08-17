package chapter7;

/**
 * 三层继承关系的工作机制：构建过程从基类开始“向外”扩散
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
