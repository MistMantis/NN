package nn;

public class InputNeuron implements Neuron {
	
	private double input;
	
	public void setInput(double input) {
		this.input = input;
	}
	
	@Override
	public double getOutput() {
		return this.input;
	}

}
