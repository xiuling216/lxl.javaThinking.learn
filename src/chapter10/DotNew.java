package chapter10;

/**
 * @echo 2013-8-12
 * 内部类.new的用法
 */
public class DotNew {
	public class Inner {
	}

	public static void main(String[] args) {
		DotNew dn=new DotNew();
		
		//与Parcel1中	Parcel2.Contents c = q.contents();等价
		DotNew.Inner dni=dn.new Inner();
	}
}
