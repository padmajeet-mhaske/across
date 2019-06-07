package com.across.across.api.dao;

public class Geo {
    String country;

    public Geo(String country) {
        this.country = country;
    }

    public Geo() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
