package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    private String ID;
    private String Namn;

    public String getID() {
        return ID;
    }

    public String getNamn() {
        return Namn;
    }

    public int getMeter() {
        return meter;
    }

    @SerializedName("size")
    private int meter;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNamn(String namn) {
        Namn = namn;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }


    @Override
    public String toString() {
        return "Mountain{" +
                "ID=' " + ID + '\'' +
        ", Namn=´" + Namn + '\'' +
        ", meter=" + meter +
                '}';

    }
}