package chapter15;

//: generics/CompilerIntelligence.java
import java.util.*;

public class CompilerIntelligence {
	public static void main(String[] args) {
		List<? extends Fruit> flist = Arrays.asList(new Apple());
		Apple a = (Apple) flist.get(0); // No warning
		flist.contains(new Apple()); // Argument is 'Object'
		flist.indexOf(new Apple()); // Argument is 'Object'
		System.out.println(flist.contains(new Apple()));
		System.out.println(flist.indexOf(new Apple()));
	}
} // /:~
