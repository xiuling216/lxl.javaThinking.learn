package chapter10;

/**
 * @echo 2013-8-12
 * 内部类与向上转型
 */
class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination {
		private String label;

		public PDestination(String whereTo) {
			label = whereTo;
		}

		@Override
		public String readLabel() {
			return label;
		}
	}

	public Destination destionation(String s) {
		return new PDestination(s);
	}

	public Contents contents() {
		return new PContents();
	}
}

public class TestParcel {

	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destionation("Tasmania");
		// Parcel4.PContents pc=p.new PContents();
	}
}
