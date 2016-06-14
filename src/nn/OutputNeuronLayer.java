package nn;

import java.util.ArrayList;
import java.util.List;

public class OutputNeuronLayer implements NeuronLayer {
	
	private ArrayList<Neuron> outputs;

	public OutputNeuronLayer(Neuron... outputs) {
		this.outputs = new ArrayList<>();
		for (Neuron o : outputs) {
			this.outputs.add(o);
		}
	}

	@Override
	public List<Neuron> getNeurons() {
		return this.outputs;
	}

	public double[] getOutputVector() {
		double[] outputVector = new double[this.outputs.size()];
		for (int i = 0; i < this.outputs.size(); i++) {
			outputVector[i] = this.outputs.get(i).getOutput();
		}
		return outputVector;
	}
}
