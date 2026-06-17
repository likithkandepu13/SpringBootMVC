package com.example.demo.request;

public class DeliveyAddress{
    private String street_name;
    private String building_name;
    private int flat_np;
    private String city;
    private int picode;

    public String getStreet_name() { return street_name; }
    public void setStreet_name(String street_name) { this.street_name = street_name; }

    public String getBuilding_name() { return building_name; }
    public void setBuilding_name(String building_name) { this.building_name = building_name; }

    public int getFlat_np() { return flat_np; }
    public void setFlat_np(int flat_np) { this.flat_np = flat_np; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public int getPicode() { return picode; }
    public void setPicode(int picode) { this.picode = picode; }
}