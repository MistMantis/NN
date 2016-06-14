package nn;

public class NeuronConnection {

	public Neuron from;
	public double weight;

	public NeuronConnection(Neuron from, double weight) {
		this.from = from;
		this.weight = weight;
	}

	public Neuron getFrom() {
		return from;
	}

	public void setFrom(Neuron from) {
		this.from = from;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
