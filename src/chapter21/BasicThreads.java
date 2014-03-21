package chapter21;

/**
 * @echo  2014-3-21
 *
 */
public class BasicThreads {

	public static void main(String[] args) {
		Thread t=new Thread(new LiftOff());
		t.start();
		System.out.println("waiting for LiftOff");
	}

}
