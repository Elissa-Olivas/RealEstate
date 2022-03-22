package com.detroitlabs.realestate.model;

public class Properties {
    private int price;
    private int numOfBathrooms;
    private int numOfBedrooms;
    private String city;
    private String state;
    private String address;
    private double sqFt;
    private String image;
    private int id;



    public Properties(int price, int numOfBathrooms, int numOfBedrooms, String city, String state, String address, double sqFt, String image, int id) {
        this.price = price;
        this.numOfBathrooms = numOfBathrooms;
        this.numOfBedrooms = numOfBedrooms;
        this.city = city;
        this.state = state;
        this.address = address;
        this.sqFt = sqFt;
        this.image = image;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //getters and setters
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSqFt() {
        return sqFt;
    }

    public void setSqFt(double sqFt) {
        this.sqFt = sqFt;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
