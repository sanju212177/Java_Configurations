package com.capg;

public class Patient {
    private int pId;
    private String pName;

    public Patient() {
    }

    public Patient(int pId, String pName) {
        this.pId = pId;
        this.pName = pName;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                '}';
    }
}
