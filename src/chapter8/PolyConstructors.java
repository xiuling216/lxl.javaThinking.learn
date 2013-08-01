package chapter8;

/**
 * @echo  2013-8-1
 *���캯���ڲ��Ķ�̬��Ϊ
 *���캯���ڲ�����ĳ���������÷���ȴ����д�ˣ���ʱ�������в�������쳣�����ǻ�����⡣
 *��˱�д���캯����һ��׼���þ����ܼ����ķ���ʹ�����������״̬��������Ա����������������
 *Ψһ��ȫ���õķ����ǣ�private��final������
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
