package chapter9;

/**
 * @echo 2013-8-2
 */
public class BandPass extends Filter {
	double lowCutoff, highCutoff;

	public BandPass(double lowCut, double highCut) {
		lowCutoff = lowCut;
		highCutoff = highCut;
	}

	public Waveform process(Waveform input) {
		return input;
	}
}
