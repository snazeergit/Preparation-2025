package com.nt.dp.Builder;

public class Bike {

	private String name;
	private String model;
	private Integer year;

	public Bike(Builder builder) {
		this.model = builder.model;
		this.name = builder.name;
		this.year = builder.year;
	}

	protected static class Builder {

		/*
		 * name and year are mandatory fields
		 */
		private final String name;
		private String model;
		private final Integer year;

		/*
		 * Constructor with mandatory fields
		 */
		public Builder(String name, Integer year) {
			this.name = name;
			this.year = year;
		}

		public Builder setModel(String model) {
			this.model = model;
			return this;
		}

		public Bike build() {
			return new Bike(this);
		}
	}

	public void printCarDetails() {
		System.out.println(name + " " + model + " " + year);
	}
}
