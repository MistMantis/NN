package functions;

public class IdentityFunction implements ActivationFunction {
	@Override
	public double f(double x) {
		return x;
	}
}
