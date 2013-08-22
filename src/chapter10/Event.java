package chapter10;

/**
 * @echo  2013-8-22
 * 内部类与控制框架1
 */
public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime){
		this.delayTime=delayTime;
		start();
	}
	public void start(){
		eventTime=System.nanoTime()+delayTime;
	}
	public boolean ready(){
		return System.nanoTime()>=eventTime;
	}
	public abstract void action();
}
