package chapter7;

import tools.P;

/**
 * ×éºÏ
 */
class WaterSource {
	private String s;

	WaterSource() {
		System.out.println("waterSource()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class SpinklerSystem {
	private String v1, v2, v3, v4;
	private WaterSource s = new WaterSource();
	private int i;
	private float f;

	public String toString() {
		return "v1=" + v1 + " v2=" + v2 + " v3=" + v3 + " v4=" + v4 + " i=" + i
				+ " f=" + f + " s=" + s;
	}

	public static void main(String[] args) {
		SpinklerSystem s = new SpinklerSystem();
		P.rint(s);
	}

}
