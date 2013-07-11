package chapter6;

import chapter5.SpicinessEnumUse.Spiciness;

public class Burrito {
	Spiciness s;

	public enum Spiciness {
		NOT, HOT, COLD, MILLK_OX
	}

	Burrito(Spiciness s) {
		this.s = s;
	}

	public void describe() {
		System.out.print("this Burrito is:");
		switch (s) {
		case NOT:
			System.out.println("not!!");
			break;
		case HOT:
			System.out.println("hot!!");
			break;
		case COLD:
			System.out.println("cold!!");
			break;
		case MILLK_OX:
			System.out.println("a ox!!");
		}
	}

	public static void main(String[] args) {
		Burrito s1 = new Burrito(Spiciness.HOT), s2 = new Burrito(
				Spiciness.MILLK_OX), s3 = new Burrito(Spiciness.NOT);
		s1.describe();
		s2.describe();
		s3.describe();

	}
}
