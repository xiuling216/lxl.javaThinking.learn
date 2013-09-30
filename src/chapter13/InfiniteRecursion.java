package chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * @echo  2013-9-30
 *
 */
public class InfiniteRecursion {
	public String toString(){
		return "InfiniteRecursion address: "+super.toString()+"\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> in=new ArrayList<InfiniteRecursion>();
		for(int i=0;i<10;i++)
			in.add(new InfiniteRecursion());
		System.out.println(in);
	}

}
