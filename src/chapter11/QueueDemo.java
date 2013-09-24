package chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @echo 2013-9-24 
 * Queue 队列 先进先出
 * offer 将一个元素插入到队尾或者返回false
 * peek 不移除返回队头 为空抛异常
 * elements 不移除返回队头 为空返回null
 * poll 移除并返回队头 为空返回null
 * remove 移除返回队头 为空抛异常
 */
public class QueueDemo {
	public static void printQ(Queue queue){
		while(queue.peek()!=null)
			System.out.print(queue.remove()+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		Random rand=new Random();
		for(int i=0;i<10;i++)
			queue.offer(rand.nextInt(i+18));
		printQ(queue);
		Queue<Character> qc=new LinkedList<Character>();
		for(char c:"Brontosaurus".toCharArray())
			qc.offer(c);
		printQ(qc);
	}

}
