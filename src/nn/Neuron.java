package nn;

import java.util.List;

public interface Neuron {
	
	double getOutput();
	
	List<NeuronConnection> getInputConnections();
	
	void setInputConnections(List<NeuronConnection> connections);
}
