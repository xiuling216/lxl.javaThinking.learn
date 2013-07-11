package chapter5;

/**
 *  π”√enum
 */
public class SpicinessEnumUse {
	public enum Spiciness {
		NOT, HOT, COLD, MILLK_OX
	}

	public static void main(String[] args) {
		Spiciness sp = Spiciness.HOT;
		System.out.println(sp+" "+sp.ordinal());
		
		for(Spiciness s:Spiciness.values())
			System.out.println(s+" ordinal: "+s.ordinal());
	}
}
