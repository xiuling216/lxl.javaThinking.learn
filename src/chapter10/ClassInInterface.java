package chapter10;
/**
 * 接口内部的类
 * @echo  2013-8-22
 *
 */
public interface ClassInInterface {
  void howdy();
  //自动的为public static的类，所以是嵌套类
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
