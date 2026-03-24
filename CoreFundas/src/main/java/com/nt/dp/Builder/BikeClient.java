package com.nt.dp.Builder;

public class BikeClient {
	public static void main(String[] args) {
		Bike bike1 = new Bike.Builder("Skoda", 2015).setModel("Rapid").build();
		bike1.printCarDetails();

		Bike bike2 = new Bike.Builder("Skoda", 2015).build();
		bike2.printCarDetails();

	}
}
