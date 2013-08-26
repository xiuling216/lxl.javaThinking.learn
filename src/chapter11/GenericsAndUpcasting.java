package chapter11;

import java.util.ArrayList;

/**
 * @echo 2013-8-26
 * 
 */
class GrannySimth extends Apple {
	public String toString(){
		return "GrannySimth";
	}
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}

public class GenericsAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new GrannySimth());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for(Apple a:apples)
			System.out.println(a);
	}

}
