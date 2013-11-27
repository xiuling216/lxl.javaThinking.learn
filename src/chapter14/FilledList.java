package chapter14;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

/**
 * @echo 2013-11-1
 * 
 */
public class FilledList<T> {
	private Class<T> type;

	public FilledList(Class<T> type) {
		this.type = type;
	}

	public List<T> create(int nElements) {
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++)
				result.add(type.newInstance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public static void main(String[] args) {
		FilledList<CountedInteger> fl = new FilledList<CountedInteger>(
				CountedInteger.class);
		System.out.println(fl.create(15));
	}
}

class CountedInteger {
	private static long counter;
	private final long id = counter++;//为final结果才增加

	public String toString() {
		return Long.toString(id);
	}
}
//output [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
