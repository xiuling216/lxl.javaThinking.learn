package chapter8;

/**
 * @echo  2013-8-1
 *构造函数内部的多态行为
 *构造函数内部调用某方法，而该方法却被重写了，此时代码运行不会出现异常，但是会出问题。
 *因此编写构造函数的一条准则：用尽可能见到的方法使对象进入正常状态。如果可以避免调用其他方法。
 *唯一安全调用的方法是：private、final方法。
 */
class Glyph{
	void draw(){
		System.out.println("Glyph.draw");
	}
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() afer draw()");
	}
}
class RoundGlyph extends Glyph{
	private int radius=1;
	RoundGlyph(int r){
		radius=r;
		System.out.println("RoundGlyph.RoundGlyph().radius = "+radius);
	}
	void draw(){
		System.out.println("RoundGlyph.drwa(),radius = "+radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}

}
