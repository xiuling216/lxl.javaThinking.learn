package tools;

import java.util.LinkedList;

/**
 * @echo 2013-9-23
 * stack ջ ����ȳ�
 */
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();

	public void push(T t) {
		storage.addFirst(t);
	}

	public T peek() {
		return storage.getFirst();
	}

	public T pop() {
		return storage.removeFirst();
	}

	public boolean empty() {
		return storage.isEmpty();
	}

	public String toString() {
		return storage.toString();
	}
}
