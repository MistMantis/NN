package main;

import java.util.Arrays;

import functions.ActivationFunction;
import functions.HardLimiterFunction;
import functions.IdentityFunction;
import nn.FixedInputBiasNeuron;
import nn.InputNeuron;
import nn.InputNeuronLayer;
import nn.NeuronConnection;
import nn.NeuronImpl;
import nn.NeuronalNetwork;
import nn.NeuronalNetworkImpl;
import nn.OutputNeuronLayer;

public class NNTester {

	public static void main(String[] args) {

		ActivationFunction hardLimiterFunction = new HardLimiterFunction(0);
		ActivationFunction identityFunction = new IdentityFunction();

		// input layer
		InputNeuron x1 = new InputNeuron(identityFunction);
		InputNeuron x2 = new InputNeuron(identityFunction);

		// hidden layer 1
		NeuronImpl n11 = new NeuronImpl(hardLimiterFunction);
		n11.getInputConnections().add(new NeuronConnection(new FixedInputBiasNeuron(), 0));
		n11.getInputConnections().add(new NeuronConnection(x1, -1));
		n11.getInputConnections().add(new NeuronConnection(x2, 1));

		NeuronImpl n12 = new NeuronImpl(hardLimiterFunction);
		n12.getInputConnections().add(new NeuronConnection(new FixedInputBiasNeuron(), 0));
		n12.getInputConnections().add(new NeuronConnection(x1, 1));
		n12.getInputConnections().add(new NeuronConnection(x2, -1));

		// // hidden layer 2
		NeuronImpl n2 = new NeuronImpl(hardLimiterFunction);
		n2.getInputConnections().add(new NeuronConnection(new FixedInputBiasNeuron(), -0.5));
		n2.getInputConnections().add(new NeuronConnection(n11, 1));
		n2.getInputConnections().add(new NeuronConnection(n12, 1));

		// create network
		InputNeuronLayer inputLayer = new InputNeuronLayer(x1, x2);
		OutputNeuronLayer outputLayer = new OutputNeuronLayer(n2);

		NeuronalNetwork nn = new NeuronalNetworkImpl(inputLayer, outputLayer);

		// test

		testXOR(nn);
	}

	public static void test4XOR(NeuronalNetwork nn) {

	}

	public static void testXOR(NeuronalNetwork nn) {
		nn.setInputVector(0, 0);
		execAndPrint(nn);
		nn.setInputVector(0, 1);
		execAndPrint(nn);
		nn.setInputVector(1, 0);
		execAndPrint(nn);
		nn.setInputVector(1, 1);
		execAndPrint(nn);
	}

	public static void execAndPrint(NeuronalNetwork nn) {
		System.out.println(Arrays.toString(nn.getInputVector()) + "   =   " + Arrays.toString(nn.getOutputVector()));
	}
}
