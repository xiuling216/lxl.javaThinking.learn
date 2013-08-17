package chapter10;

/**
 * @echo 2013-8-17 匿名内部类中字段的初始化
 */
public class Parcel9 {
	public Destination destination( final String dest) {
		return new Destination() {
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p=new Parcel9();
		Destination d=p.destination("Tamania");
		System.out.println(d.readLabel());
	}
}
