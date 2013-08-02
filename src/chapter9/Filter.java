package chapter9;

/**
 * @echo 2013-8-2
 */
public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}

	public Waveform process(Waveform input) {
		return input;
	}
}
