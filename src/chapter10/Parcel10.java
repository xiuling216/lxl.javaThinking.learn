package chapter10;

/**
 * @echo 2013-8-17 �����ڲ����ʵ����ʼ��
 * �����ڲ���������ļ̳������Щ���ƣ� ��Ϊ�����ڲ���ȿ��������࣬Ҳ����ʵ�ֽӿڣ����ǲ������߼汸�����������ʵ�ֽӿڣ�Ҳֻ��ʵ��һ���ӿڡ�
 */
public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if (cost > 100) {
					System.out.println("over budget");
				}
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tamania", 105.5f);
	}
}
