package com.across.across.api.dao;

public class Device {
    String ip;
    Geo geo;
    String country_code;

    public Device(String ip) {
        this.ip = ip;
    }

    public Device() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
}
