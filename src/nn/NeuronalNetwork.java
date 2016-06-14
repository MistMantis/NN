package nn;

public interface NeuronalNetwork {
	
	void setInput(double... inputVector);
	
	double[] getOutput();
}
