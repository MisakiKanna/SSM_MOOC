package com.qfedu.domain;

public class Classify {
    private  int id;
    private String bigName;
    private String smallName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBigName() {
        return bigName;
    }

    public void setBigName(String bigName) {
        this.bigName = bigName;
    }

    public String getSmallName() {
        return smallName;
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "id=" + id +
                ", bigName='" + bigName + '\'' +
                ", smallName='" + smallName + '\'' +
                '}';
    }
}
