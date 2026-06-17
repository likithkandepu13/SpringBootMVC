package com.example.demo.request;

public class LoginRequest {

    private int userid;
    private String uname;

    public int getUserid() {
        return userid;
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

    @Override
    public String toString() {
        return "LoginRequest [userid=" + userid + ", uname=" + uname + "]";
    }
}