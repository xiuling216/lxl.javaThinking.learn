package chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @echo 2013-9-24 
 * Queue ���� �Ƚ��ȳ�
 * offer ��һ��Ԫ�ز��뵽��β���߷���false
 * peek ���Ƴ����ض�ͷ Ϊ�����쳣
 * elements ���Ƴ����ض�ͷ Ϊ�շ���null
 * poll �Ƴ������ض�ͷ Ϊ�շ���null
 * remove �Ƴ����ض�ͷ Ϊ�����쳣
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
