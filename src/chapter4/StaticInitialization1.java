package chapter4;

class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Table {
	Bowl b1 = new Bowl(1);

	Table() {
		System.out.println("Table()");
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}

	static Bowl b2 = new Bowl(2);
}

public class StaticInitialization1 {
	public static void main(String[] args) {
		System.out.println("=========main===========");
		Table t3 = new Table();
		t2.f2(2);
	}

	static Table t2 = new Table();
}
