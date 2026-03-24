package com.nt.dp.Builder;

public class Car {

	private String name;
	private String model;
	private Integer year;

	public Car(Builder builder) {
		this.model = builder.model;
		this.name = builder.name;
		this.year = builder.year;
	}

	protected static class Builder {

		private String name;
		private String model;
		private Integer year;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setModel(String model) {
			this.model = model;
			return this;
		}

		public Builder setYear(Integer year) {
			this.year = year;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}

	public void printCarDetails() {
		System.out.println(name + " " + model + " " + year);
	}
}
