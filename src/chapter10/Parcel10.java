package chapter10;

/**
 * @echo 2013-8-17 匿名内部类的实例初始化
 * 匿名内部类与正规的继承相比有些限制， 因为匿名内部类既可以扩张类，也可以实现接口，但是不能两者兼备，而且如果是实现接口，也只能实现一个接口。
 */
public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if (cost > 100) {
					System.out.println("over budget");
				}
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tamania", 105.5f);
	}
}
