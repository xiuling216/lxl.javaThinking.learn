package chapter12;

/**
 * @echo 2013-9-25
 * 
 */
public class MyException {

	public static void main(String[] args) {
		int i = 10;
		while (i > 7) {
			try {
				if (i == 10) {
					i--;
					throw new Exception("i==10");
				}
				if (i == 9) {
					i--;
					throw new ExceptionInInitializerError("i==9");
				} else
					i--;
			} catch (ExceptionInInitializerError e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
