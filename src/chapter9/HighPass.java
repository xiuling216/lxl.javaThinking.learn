package chapter9;

/**
 * @echo 2013-8-2
 */
public class HighPass extends Filter {
	double cutoff;

	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public Waveform process(Waveform input) {
		return input;
	}
}
