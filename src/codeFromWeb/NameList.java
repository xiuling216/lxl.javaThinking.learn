package codeFromWeb;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @echo 2014-3-28
 * 
 */
public class NameList {
	private List nameList = Collections.synchronizedList(new LinkedList());

	public synchronized  void add(String name) {
		nameList.add(name);
	}

	public synchronized String removeFirst() {
		if (nameList.size() > 0) {
			return (String) nameList.remove(0);
		} else {
			return null;
		}
	}
}