package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @echo 2013-8-29
 * 容器的打印
 */
public class PrintingContainer {
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String,String> map){
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));//按元素添加顺序保存
		System.out.println(fill(new LinkedList<String>()));//按元素添加顺序保存
		//set中相同项只保存一次
		System.out.println(fill(new HashSet<String>()));//最快的获取元素的方式，无序
		System.out.println(fill(new TreeSet<String>()));//按升序保存
		System.out.println(fill(new LinkedHashSet<String>()));//按元素添加顺序保存
		System.out.println(fill(new HashMap<String,String>()));//无序
		System.out.println(fill(new TreeMap<String,String>()));//按升序保存键
		System.out.println(fill(new LinkedHashMap<String,String>()));//按元素添加顺序保存
	}
}
