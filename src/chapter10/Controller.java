package chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * @echo 2013-8-22
 * 内部类与控制框架2
 */
public class Controller {
	private List<Event> eventList = new ArrayList<Event>();

	public void addEvent(Event d) {
		eventList.add(d);
	}

	public void run() {
		while (eventList.size() > 0)
			for (Event e : new ArrayList<Event>(eventList))
				if (e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
	}
}
