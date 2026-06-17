package com.example.demo.request;

public class CarInfo {
	private String modelName;
	private int year;
	private String fuelType;
	private int price;
	public String getModelName() {
	    return modelName;
	}

	public void setModelName(String modelName) {
	    this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "CarInfo [modelName=" + modelName + ", year=" + year + ", fuelType=" + fuelType + ", price=" + price
				+ "]";
	}

	public int getYear() {
	    return year;
	}

	public void setYear(int year) {
	    this.year = year;
	}

	public String getFuelType() {
	    return fuelType;
	}

	public void setFuelType(String fuelType) {
	    this.fuelType = fuelType;
	}

	public int getPrice() {
	    return price;
	}

	public void setPrice(int price) {
	    this.price = price;
	}
}
