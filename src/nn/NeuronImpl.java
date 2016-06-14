package nn;

import java.util.LinkedList;
import java.util.List;

import functions.ActivationFunction;

public class NeuronImpl implements Neuron {

	private List<NeuronConnection> inputs;

	private ActivationFunction activationFunction;

	private Double output;

	public NeuronImpl(ActivationFunction f) {
		this.inputs = new LinkedList<>();
		this.activationFunction = f;
	}

	/**
	 * computes the output of the {@link Neuron}. if the output has already been
	 * computed (!= null), it is not computed again.
	 * 
	 * @return output value
	 */
	@Override
	public double getOutput() {
		if (this.output == null) {

			double sum = 0d;
			// input function
			for (NeuronConnection c : this.inputs) {
				sum += (c.getFrom().getOutput() * c.getWeight());
			}

			// activation function
			this.output = this.activationFunction.f(sum);
		}
		return this.output;
	}

	public List<NeuronConnection> getInputs() {
		return inputs;
	}
	
	public void setInputs(List<NeuronConnection> connections) {
		this.inputs = connections;
	}

}
