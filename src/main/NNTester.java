package main;

import functions.ActivationFunction;
import functions.HardLimiterFunction;
import nn.InputNeuron;
import nn.InputNeuronLayer;
import nn.Neuron;
import nn.NeuronImpl;
import nn.NeuronalNetwork;
import nn.NeuronalNetworkImpl;
import nn.OutputNeuronLayer;

public class NNTester {

	public static void main(String[] args) {

		ActivationFunction hardLimiterFunction = new HardLimiterFunction(0);

		InputNeuronLayer inputLayer = null;
		OutputNeuronLayer outputLayer = null;

		NeuronalNetwork nn = new NeuronalNetworkImpl(inputLayer, outputLayer);

		InputNeuron x1 = new InputNeuron();
		InputNeuron x2 = new InputNeuron();
		InputNeuron x3 = new InputNeuron();
		InputNeuron x4 = new InputNeuron();

		inputLayer = new InputNeuronLayer(x1, x2, x3, x4);

		Neuron o1 = new NeuronImpl(hardLimiterFunction);
		outputLayer = new OutputNeuronLayer(o1);

		test4XOR(nn);
	}

	public static void test4XOR(NeuronalNetwork nn) {

	}
}
