package nn;

import java.util.List;

public class NeuronLayerImpl implements NeuronLayer {
	
	private List<Neuron> neurons;
	
	public NeuronLayerImpl(List<Neuron> neurons) {
		this.neurons = neurons;
	}
	
	@Override
	public List<Neuron> getNeurons() {
		return this.neurons;
	}
}
