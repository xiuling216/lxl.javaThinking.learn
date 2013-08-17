package chapter9;

/**
 * @echo 2013-8-2
 */
public class Waveform {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Waveform " + id;
	}
}
