package chapter14;

/**
 * @echo 2013-11-1
 * 
 */
public class GenericToyTest {
	public static void main(String[] args) throws Exception {
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();// 某个类，它是FancyToy超类
		Object t = up.newInstance();
	}
}
