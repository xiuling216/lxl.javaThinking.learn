package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @echo 2013-8-29
 * list 添加一组元素
 */
class Snow {
}

class Powder extends Snow {
	public String toString(){
		return "Powder";
	}
}

class Light extends Snow {
	public String toString(){
		return "Light";
	}
}

class Heavy extends Snow {
	public String toString(){
		return "Heavy";
	}
}

class Crusty extends Snow {
	public String toString(){
		return "Crusty";
	}
}

class Slush extends Snow {
	public String toString(){
		return "Slush";
	}
}

public class AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(),
				new Powder());
		for(Snow s:snow1)
			System.out.println(s+" ");
		
		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		for(Snow s:snow2)
			System.out.println(s+" ");
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
	}

}
