package chapter10;

/**
 * @echo 2013-8-12
 * �ڲ���.new���÷�
 */
public class DotNew {
	public class Inner {
	}

	public static void main(String[] args) {
		DotNew dn=new DotNew();
		
		//��Parcel1��	Parcel2.Contents c = q.contents();�ȼ�
		DotNew.Inner dni=dn.new Inner();
	}
}
