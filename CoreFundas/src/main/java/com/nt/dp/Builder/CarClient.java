package com.nt.dp.Builder;

public class CarClient {
	public static void main(String[] args) {
		Car car1 = new Car.Builder().setName("Skoda").setModel("Rapid").setYear(2015).build();
		car1.printCarDetails();

		Car car2 = new Car.Builder().setName("Skoda").build();
		car2.printCarDetails();

		Car car3 = new Car.Builder().setModel("Rapid").setYear(2015).build();
		car3.printCarDetails();

	}
}
