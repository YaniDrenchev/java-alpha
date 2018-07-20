package com.example.hibernatedemo.models;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId")
    private int addressId;
    @Column(name = "addressText")
    private String addressText;

    public Address(){

    }

    public Address(String addressText) {
        this.addressText = addressText;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    @Override
    public String toString() {
        return String.format("%s", addressText);
    }
}
