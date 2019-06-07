package com.across.across.api.dao;

public class Demographics {

    int pct_female;
    int pct_male;

    public Demographics(int female_percent, int male_percent) {
        this.pct_female = female_percent;
        this.pct_male = male_percent;
    }

    public Demographics() {
    }

    public int getPct_female() {
        return pct_female;
    }

    public void setPct_female(int pct_female) {
        this.pct_female = pct_female;
    }

    public int getPct_male() {
        return pct_male;
    }

    public void setPct_male(int pct_male) {
        this.pct_male = pct_male;
    }
}
