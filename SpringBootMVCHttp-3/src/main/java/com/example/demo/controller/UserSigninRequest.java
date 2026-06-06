package com.example.demo.controller;

public class UserSigninRequest 
{
	private int userid;
	private String username;
	private String address;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
	    return "UserSigninRequest [userid=" + userid +
	           ", username=" + username +
	           ", address=" + address + "]";
	}
}
