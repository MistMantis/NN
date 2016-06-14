package nn;

import java.util.List;

public class FixedInputBiasNeuron implements Neuron {
	@Override
	public double getOutput() {
		return 1;
	}
	
	@Override
	public List<NeuronConnection> getInputConnections() {
		return null;
	}
	
	@Override
	public void setInputConnections(List<NeuronConnection> connections) {
		// do nothing
	}
}
