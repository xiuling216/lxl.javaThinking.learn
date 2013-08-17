package chapter10;

/**
 * @echo 2013-8-17 在方法内的内部类，称作局部内部类
 */
public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;

			public PDestination(String whereTo) {
				label = whereTo;
			}

			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}

	public static void main(String[] args) {
		Parcel5 p=new Parcel5();
		Destination d=p.destination("Tasmania");
	}
}
