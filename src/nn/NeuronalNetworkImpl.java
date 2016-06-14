package nn;

import java.util.List;

public class NeuronalNetworkImpl implements NeuronalNetwork {
	
	private final InputNeuronLayer inputs;
	
	private final OutputNeuronLayer outputs;
	
	public NeuronalNetworkImpl(InputNeuronLayer inputs, OutputNeuronLayer outputs) {
		super();
		this.inputs = inputs;
		this.outputs = outputs;
	}

	@Override
	public double[] getInputVector() {
		List<? extends Neuron> list = this.inputs.getNeurons();
		double[] inputVector = new double[list.size()];
		for (int i = 0; i < inputVector.length; i++) {
			inputVector[i] = list.get(i).getOutput();
		}
		return inputVector;
	}
	
	@Override
	public void setInputVector(double... inputVector) {
		this.inputs.setInputVector(inputVector);
	}
	
	@Override
	public double[] getOutputVector() {
		return this.outputs.getOutputVector();
	}
}
