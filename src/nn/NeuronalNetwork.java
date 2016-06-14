package nn;

public interface NeuronalNetwork {
	
	double[] getInputVector();
	
	void setInputVector(double... inputVector);
	
	double[] getOutputVector();
}
