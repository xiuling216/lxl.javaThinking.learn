package codeFromWeb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @echo 2014-4-9 Java�̣߳���
 */
public class TestLock {
	public static void main(String[] args) {
		// �����������ʵ��˻�
		MyCount myCount = new MyCount("95599200901215522", 10000);
		// ����һ��������
		Lock lock = new ReentrantLock();
		// ����һ���̳߳�
		ExecutorService pool = Executors.newCachedThreadPool();
		// ����һЩ���������û���һ�����ÿ�����Ĵ棬ȡ��ȡ�������ְ�
		UserCredit u1 = new UserCredit("����", myCount, -4000, lock);
		UserCredit u2 = new UserCredit("��������", myCount, 6000, lock);
		UserCredit u3 = new UserCredit("��������", myCount, -8000, lock);
		UserCredit u4 = new UserCredit("����", myCount, 800, lock);
		// ���̳߳���ִ�и����û��Ĳ���
		pool.execute(u1);
		pool.execute(u2);
		pool.execute(u3);
		pool.execute(u4);
		// �ر��̳߳�
		pool.shutdown();
	}
}

/**
 * ���ÿ����û�
 */
class UserCredit implements Runnable {
	private String name; // �û���
	private MyCount myCount; // ��Ҫ�������˻�
	private int iocash; // �����Ľ���Ȼ������֮����
	private Lock myLock; // ִ�в��������������

	UserCredit(String name, MyCount myCount, int iocash, Lock myLock) {
		this.name = name;
		this.myCount = myCount;
		this.iocash = iocash;
		this.myLock = myLock;
	}

	public void run() {
		// ��ȡ��
		myLock.lock();
		// ִ���ֽ�ҵ��
		System.out.println(name + "���ڲ���" + myCount + "�˻������Ϊ" + iocash
				+ "����ǰ���Ϊ" + myCount.getCash());
		myCount.setCash(myCount.getCash() + iocash);
		System.out.println(name + "����" + myCount + "�˻��ɹ������Ϊ" + iocash
				+ "����ǰ���Ϊ" + myCount.getCash());
		// �ͷ������������߳�û�л���ִ����
		myLock.unlock();
	}
}

/**
 * ���ÿ��˻���������͸֧
 */
class MyCount {
	private String oid; // �˺�
	private int cash; // �˻����

	MyCount(String oid, int cash) {
		this.oid = oid;
		this.cash = cash;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	@Override
	public String toString() {
		return "MyCount{" + "oid='" + oid + '\'' + ", cash=" + cash + '}';
	}
}
