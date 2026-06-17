package com.example.demo.request;

import java.util.List;

import lombok.Data;

@Data
public class OrderRequest 
{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public List<ProductInfo> getProfuctinfo() {
		return profuctinfo;
	}
	public void setProfuctinfo(List<ProductInfo> profuctinfo) {
		this.profuctinfo = profuctinfo;
	}
	public DeliveyAddress getDeliveryaddress() {
		return deliveryaddress;
	}
	public void setDeliveryaddress(DeliveyAddress deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}
	public String getPayment_status() {
		return Payment_status;
	}
	public void setPayment_status(String payment_status) {
		Payment_status = payment_status;
	}



	private String name;
	private String email;
	private long mobile;
	private int totalamount;
	private List<ProductInfo> profuctinfo;
	private DeliveyAddress deliveryaddress;
	private String Payment_status;
	
}
