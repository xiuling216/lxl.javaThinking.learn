package chapter15;

//: generics/ErasedTypeEquivalence.java
import java.util.*;

public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		Class c3=new ArrayList<Generators>().getClass();
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		System.out.println(c2 == c3);
	}
} /*
 * Output: true
 */// :~
