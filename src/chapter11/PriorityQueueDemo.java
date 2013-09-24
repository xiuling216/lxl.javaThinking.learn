package chapter11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/**
 * @echo 2013-9-24
 * 
 */
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++)
			pq.offer(rand.nextInt(i + 10));
		QueueDemo.printQ(pq);

		List<Integer> ints = Arrays.asList(12, 4, 52, 2, 34, 56, 21, 34, 3, 22);
		pq = new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(pq);

		pq=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
		pq.addAll(ints);
		QueueDemo.printQ(pq);
		
		String fact="AKDF DALD FSAJF ATHNG ADJA HGALF";
		List<String> strings=Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ=new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);
		
		stringPQ=new PriorityQueue<String>(strings.size(),Collections.reverseOrder());
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);
		
		Set<Character> charSet=new HashSet<Character>();
		for(char c:fact.toCharArray())
			charSet.add(c);
		PriorityQueue<Character> characterPQ=new PriorityQueue<Character>(charSet);
		QueueDemo.printQ(characterPQ);
		
	}

}
