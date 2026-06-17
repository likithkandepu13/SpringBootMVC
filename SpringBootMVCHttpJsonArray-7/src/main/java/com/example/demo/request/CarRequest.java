package com.example.demo.request;
import java.util.List;

public class CarRequest 
{
	@Override
	public String toString() {
		return "CarRequest [Brand=" + Brand + ", carInfo=" + carInfo + "]";
	}

	private String Brand;
	private List<CarInfo> carInfo;
	public String getBrand() {
	    return Brand;
	}

	public void setBrand(String Brand) {
	    this.Brand = Brand;
	}

	public List<CarInfo> getCarInfo() {
	    return carInfo;
	}

	public void setCarInfo(List<CarInfo> carInfo) {
	    this.carInfo = carInfo;
	}
}
