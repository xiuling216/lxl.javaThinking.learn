package chapter10;
/**
 * ���ؼ̳еĽ����ʽ��
 * ʵ�ֶ���ӿڣ����Զ��ʹ��implements������ʹ���ڲ���
 * ���Ƕ��ھ��������߳�����ֻ࣬��ʹ���ڲ���
 * @echo  2013-8-22
 *
 */
class D {}
abstract class E {}

class Z extends D {
  E makeE() { return new E() {}; }
}

public class MultiImplementation {
  static void takesD(D d) {}
  static void takesE(E e) {}
  public static void main(String[] args) {
    Z z = new Z();
    takesD(z);
    takesE(z.makeE());
  }
} 
