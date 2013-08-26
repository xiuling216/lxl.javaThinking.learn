package chapter10;

//: innerclasses/LocalInnerClass.java
// Holds a sequence of Objects.
/**
 * @echo  2013-8-26
 *局部内部类与匿名内部类的对比  
 *使用局部内部类而不使用匿名内部类的唯一理由是：
 *需要一个已命名的构造器，或者需要重载构造器，而匿名内部类只能用于实例初始化。
 */
interface Counter {
	int next();
}

public class LocalInnerClass {
	private int count = 0;

	Counter getCounter(final String name) {
		// A local inner class:
		class LocalCounter implements Counter {
			public LocalCounter() {
				// Local inner class can have a constructor
				System.out.println("LocalCounter()");
			}

			public int next() {
				System.out.println(name); // Access local final
				return count++;
			}
		}
		return new LocalCounter();
	}

	// The same thing with an anonymous inner class:
	Counter getCounter2(final String name) {
		return new Counter() {
			// Anonymous inner class cannot have a named
			// constructor, only an instance initializer:
			{
				System.out.println("Counter()");
			}

			public int next() {
				System.out.println(name); // Access local final
				return count++;
			}
		};
	}

	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("Local inner "), c2 = lic
				.getCounter2("Anonymous inner ");
		for (int i = 0; i < 5; i++)
			System.out.println(c1.next());
		for (int i = 0; i < 5; i++)
			System.out.println(c2.next());
	}
} /*
 * Output: LocalCounter() Counter() Local inner 0 Local inner 1 Local inner 2
 * Local inner 3 Local inner 4 Anonymous inner 5 Anonymous inner 6 Anonymous
 * inner 7 Anonymous inner 8 Anonymous inner 9
 */// :~
