package chapter10;
/**
 * 利用嵌套类测试
 * 书中说：曾建议在每个类中都写一个main()方法，
 * 用来测试这个类。但这样有个缺点，就是必须带着那些已编译过的额外的代码。
 * 如果这是个麻烦，就可以使用嵌套类来放置测试代码，如此例。
 * 会生成一个独立的TestBed$Tester,可单独测试，也可以以在最后打包发布删除。
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
