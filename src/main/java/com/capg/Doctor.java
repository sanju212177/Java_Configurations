package com.capg;

public class Doctor {
    private int docId;
    private String docName;
    Patient patient;

    public Doctor() {
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor(int docId, String docName, Patient patient) {
        this.docId = docId;
        this.docName = docName;
        this.patient = patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getDocId() {
        return docId;
    }


    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "docId=" + docId +
                ", docName='" + docName + '\'' +
                ", patient=" + patient +
                '}';
    }
}
