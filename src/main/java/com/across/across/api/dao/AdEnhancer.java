package com.across.across.api.dao;

public class AdEnhancer {
    Site site;
    Device device;
    User user;

    public AdEnhancer(Site site, Device device, User user) {
        this.site = site;
        this.device = device;
        this.user = user;
    }

    public AdEnhancer() {
        //demo data populated
        this.site = new Site("Fool123", "http://www.foo.com/why-foo");
        this.device = new Device("69.250.196.118");
        this.user = new User("9cb89r");
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
