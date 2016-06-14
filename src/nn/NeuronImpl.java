package nn;

import java.util.LinkedList;
import java.util.List;

import functions.ActivationFunction;

public class NeuronImpl implements Neuron {

	private List<NeuronConnection> inputs;

	private ActivationFunction activationFunction;

	public NeuronImpl(ActivationFunction f) {
		this.inputs = new LinkedList<>();
		this.activationFunction = f;
	}

	@Override
	public double getOutput() {
		double sum = 0d;
		// input function
		for (NeuronConnection c : this.inputs) {
			sum += (c.getFrom().getOutput() * c.getWeight());
		}
		// activation function
		return this.activationFunction.f(sum);
	}

	public List<NeuronConnection> getInputConnections() {
		return inputs;
	}

	public void setInputConnections(List<NeuronConnection> connections) {
		this.inputs = connections;
	}

	public ActivationFunction getActivationFunction() {
		return activationFunction;
	}

	public void setActivationFunction(ActivationFunction activationFunction) {
		this.activationFunction = activationFunction;
	}
}
