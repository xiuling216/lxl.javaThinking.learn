package chapter10;
/**
 * ����Ƕ�������
 * ����˵����������ÿ�����ж�дһ��main()������
 * ������������ࡣ�������и�ȱ�㣬���Ǳ��������Щ�ѱ�����Ķ���Ĵ��롣
 * ������Ǹ��鷳���Ϳ���ʹ��Ƕ���������ò��Դ��룬�������
 * ������һ��������TestBed$Tester,�ɵ������ԣ�Ҳ�����������������ɾ����
 * @echo  2013-8-22
 */

public class TestBed {
  public void f() { System.out.println("f()"); }
  public static class Tester {
    public static void main(String[] args) {
      TestBed t = new TestBed();
      t.f();
    }
  }
} /* Output:
f()
*///:~
