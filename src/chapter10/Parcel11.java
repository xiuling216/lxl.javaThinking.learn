package chapter10;

/**
 * Ƕ����
 * @echo 2013-8-22
 */

public class Parcel11 {
	private static class ParcelContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}

	/*
	 * Ƕ����
	 */
	protected static class ParcelDestination implements Destination {
		private String label;

		private ParcelDestination(String whereTo) {
			label = whereTo;
		}

		public String readLabel() {
			return label;
		}

		//Ƕ������԰���staticԪ��
		public static void f() {}
		static int x = 10;		
		static class AnotherLevel {
			public static void f() {}
				static int x = 10;
		}
	}
	
	public static Destination destination(String s){
		return new ParcelDestination(s);
	}
	
	public static Contents contents(){
		return new ParcelContents();
	}
	
	public static void main(String[] args){
		contents();
		Destination d=destination("Tamania");
	}
}
