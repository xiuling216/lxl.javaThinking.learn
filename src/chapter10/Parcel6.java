package chapter10;

/**
 * @echo 2013-8-17 作用域内的内部类
 */
public class Parcel6 {
	private void internelTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;

				TrackingSlip(String s) {
					id = s;
				}

				String getSlip() {
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
		}
	}

	public void track() {
		internelTracking(true);
	}

	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();
	}
}
