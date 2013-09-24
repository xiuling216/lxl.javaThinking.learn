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
 * �����Ĵ�ӡ
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
		System.out.println(fill(new ArrayList<String>()));//��Ԫ�����˳�򱣴�
		System.out.println(fill(new LinkedList<String>()));//��Ԫ�����˳�򱣴�
		//set����ͬ��ֻ����һ��
		System.out.println(fill(new HashSet<String>()));//���Ļ�ȡԪ�صķ�ʽ������
		System.out.println(fill(new TreeSet<String>()));//�����򱣴�
		System.out.println(fill(new LinkedHashSet<String>()));//��Ԫ�����˳�򱣴�
		System.out.println(fill(new HashMap<String,String>()));//����
		System.out.println(fill(new TreeMap<String,String>()));//�����򱣴��
		System.out.println(fill(new LinkedHashMap<String,String>()));//��Ԫ�����˳�򱣴�
	}
}
