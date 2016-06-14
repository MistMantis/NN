package functions;

public class HardLimiterFunction implements ActivationFunction {
	private final double threshold;

	public HardLimiterFunction(double threshold) {
		this.threshold = threshold;
	}

	@Override
	public double f(double x) {
		return x >= this.threshold ? 1d : 0d;
	}
}
