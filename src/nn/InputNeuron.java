package nn;

import functions.ActivationFunction;

public class InputNeuron extends NeuronImpl {

	public InputNeuron(ActivationFunction f) {
		super(f);
	}

	private double input;

	public void setInput(double input) {
		this.input = input;
	}

	@Override
	public double getOutput() {
		double sum = input;
		// input function
		for (NeuronConnection c : this.getInputConnections()) {
			sum += (c.getFrom().getOutput() * c.getWeight());
		}
		// activation function
		return this.getActivationFunction().f(sum);
	}
}
