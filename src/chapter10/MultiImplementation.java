package chapter10;
/**
 * 多重继承的解决方式：
 * 实现多个接口，可以多次使用implements，或者使用内部类
 * 但是对于具体的类或者抽象的类，只能使用内部类
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
