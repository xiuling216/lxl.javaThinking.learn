package chapter10;
/**
 * �ӿ��ڲ�����
 * @echo  2013-8-22
 *
 */
public interface ClassInInterface {
  void howdy();
  //�Զ���Ϊpublic static���࣬������Ƕ����
  class Test implements ClassInInterface {
    public void howdy() {
      System.out.println("Howdy!");
    }
    public static void main(String[] args) {
      new Test().howdy();
    }
  }
} /* Output:
Howdy!
*///:~
