package chapter12;

/**
 * @echo 2013-9-26 异常类:接受字符串参数的构造器
 */
public class FullConstructors {
	public static void f() throws MyException {
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}

	public static void g() throws MyException {
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}

	public static void main(String[] args) {
		try{
			f();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
		
	}

}

class MyException extends Exception {
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}
}
