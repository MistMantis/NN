package nn;

public class NeuronalNetworkImpl implements NeuronalNetwork {
	
	private final InputNeuronLayer inputs;
	
	private final OutputNeuronLayer outputs;
	
	public NeuronalNetworkImpl(InputNeuronLayer inputs, OutputNeuronLayer outputs) {
		super();
		this.inputs = inputs;
		this.outputs = outputs;
	}

	@Override
	public void setInput(double... inputVector) {
		this.inputs.setInputVector(inputVector);
	}
	
	@Override
	public double[] getOutput() {
		return this.outputs.getOutput();
	}
}
