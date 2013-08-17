package chapter10;

/**
 * @echo 2013-8-17 匿名内部类 带参构造器
 */
public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value() * 47;
			}
		};
	}

	public static void main(String[] args) {
		Parcel8 p=new Parcel8();
		Wrapping w=p.wrapping(10);
		System.out.println(w.value());
	}
}
