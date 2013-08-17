package chapter10;

/**
 * @echo 2013-8-17 �ڷ����ڵ��ڲ��࣬�����ֲ��ڲ���
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
