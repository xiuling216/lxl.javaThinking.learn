package chapter9;

/**
 * @echo 2013-8-2
 */
public class LowPass extends Filter {
	double cutoff;

	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public Waveform process(Waveform input) {
		return input;
	}
}
