package com.detroitlabs.realestate.model;

public class ListingAgent {
    private String firstName;
    private String lastName;
    private String phnNum;
    private String email;


    public ListingAgent(String firstName, String lastName, String phnNum, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phnNum = phnNum;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
