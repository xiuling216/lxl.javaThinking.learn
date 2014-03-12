package chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * @echo 2014-1-17 测试数组与Arraylist的速度
 */
public class testArrayAndArrayList {

	public static void main(String[] args) {
		int n = 1000000;
		int[] a = new int[n];

		long time1 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}
		System.out.println(System.currentTimeMillis() - time1);

		List list = new ArrayList();
		long time2 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		System.out.println(System.currentTimeMillis() - time2);
	}
}
