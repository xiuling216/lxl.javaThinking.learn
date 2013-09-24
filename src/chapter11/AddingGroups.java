package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @echo 2013-8-28 向collection中添加一组元素
 */
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(
				1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		collection.addAll(collection);
		for (Integer i : collection)
			System.out.print(i + " ");

		System.out.println("\n*************");
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99);
		for (Integer i : list)
			System.out.print(i + " ");

		System.out.println("\n*************");
		List<String> listStr = Arrays.asList("aaa", "bbb", "ccc", "ddd");
		for (String s : listStr)
			System.out.print(s + " ");
	}
}
