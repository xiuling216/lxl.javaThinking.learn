package chapter10;


class WithInner {
  class Inner {
	  Inner(){
		  System.out.println("Inner");
	  }
  }
  class InnerB {
	  InnerB(){
		  System.out.println("InnerB");
	  }
  }
}

/**
 * @echo  2013-8-26
 *�ڲ���ļ̳�
 */
public class InheritInner extends WithInner.Inner {
  //! InheritInner() {} // Won't compile
  InheritInner(WithInner wi) {
    wi.super();
    new extendsInnerB(wi);
  }
  
  class extendsInnerB extends WithInner.InnerB{
	  extendsInnerB(WithInner wi){
		  wi.super();//�̳еĹ������﷨
	  }
  }
  
  public static void main(String[] args) {
    WithInner wi = new WithInner();
    InheritInner ii = new InheritInner(wi);
  }
} ///:~
