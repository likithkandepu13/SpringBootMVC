package com.example.demo.response;

public class UserResponse {
	private int userid;
	private String uname;
	private String address;
	private String pincode;
	public int getUserid() {
		return userid;
	}
	@Override
	public String toString() {
		return "UserRequest [userid=" + userid + ", uname=" + uname + ", address=" + address + ", pincode=" + pincode
				+ "]";
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
