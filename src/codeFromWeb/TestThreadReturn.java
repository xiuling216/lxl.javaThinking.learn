package codeFromWeb;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @echo 2014-4-9 Java线程：有返回值的线程
 */
public class TestThreadReturn {
	public static void main(String[] args) throws ExecutionException,
			InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Callable c1 = new MyCallable("A");
		Callable c2 = new MyCallable("B");
		Future f1 = pool.submit(c1);
		Future f2 = pool.submit(c2);
		System.out.println(">>>>>" + f1.get().toString() + "\n>>>>>"
				+ f2.get().toString());
		pool.shutdown();
	}
}

class MyCallable implements Callable {
	private String oid;

	MyCallable(String oid) {
		this.oid = oid;
	}

	public Object call() {
		return oid + "任务返回的内容";
	}
}