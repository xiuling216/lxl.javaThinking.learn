package chapter21;

/**
 * @echo 2014-3-21
 * 
 */
public class MoreBasicThreads {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new Thread(new LiftOff()).start();
		System.out.println("waiting for LiftOff");
	}

}
