package chapter11;

import tools.Stack;

/**
 * @echo 2013-9-23 使用LinkedList实现的stack类
 */
public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.println(stack.pop() + " ");
	}
}
