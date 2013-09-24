package chapter11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @echo  2013-8-28
 *
 */
public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			c.add(i);
		for(Integer i:c)
			System.out.print(i+" ");
	}
}
