package nn;

import java.util.ArrayList;
import java.util.List;

public class InputNeuronLayer implements NeuronLayer {

	private List<InputNeuron> inputs;

	public InputNeuronLayer(InputNeuron... inputs) {
		this.inputs = new ArrayList<>();
		for (InputNeuron i : inputs) {
			this.inputs.add(i);
		}
	}

	/**
	 *
	 * @throws IllegalArgumentException
	 *             in case that the input vector has more or less elements than
	 *             the stored neurons in this layer
	 * @param inputVector
	 */
	public void setInputVector(double... inputVector) {
		if (inputVector.length != inputs.size()) {
			throw new IllegalArgumentException("wrong input size");
		}
		for (int i = 0; i < inputVector.length; i++) {
			this.inputs.get(i).setInput(inputVector[i]);
		}
	}

	@Override
	public List<InputNeuron> getNeurons() {
		return this.inputs;
	}
}
