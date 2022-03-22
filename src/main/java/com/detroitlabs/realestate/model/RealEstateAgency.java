package com.detroitlabs.realestate.model;

public class RealEstateAgency {
    private String name;
    private String address;
    private String phnNum;
    private String email;


    public RealEstateAgency(String name, String address, String phnNum, String email) {
        this.name = name;
        this.address = address;
        this.phnNum = phnNum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
