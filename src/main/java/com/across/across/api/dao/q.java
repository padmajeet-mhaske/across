package com.across.across.api.dao;

public class q {
    siteId q;

    public q(String siteId) {
        this.q = new siteId(siteId);
    }

    public siteId getQ() {
        return q;
    }

    public void setQ(siteId q) {
        this.q = q;
    }
}

class siteId {
    String siteId;

    public siteId() {
    }

    public siteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
}
