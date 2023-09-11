package com.bharath.app.model;

import org.springframework.stereotype.Component;

@Component
public class hospital {

    String patientname;
    String hospitalname;
    int id;
    String disease;

    public hospital(){}

    public hospital(String patientname, String hospitalname, int id, String disease) {
        this.patientname = patientname;
        this.hospitalname = hospitalname;
        this.id = id;
        this.disease = disease;
    }

    public String getPatientName() {
        return patientname;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public int getId() {
        return id;
    }

    public String getDisease() {
        return disease;
    }
    public void setName(String patientname) {
        this.patientname = patientname;
    }

    public void setRollNo(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public void setAge(int id) {
        this.id = id;
    }

    public void setStd(String disease) {
        this.disease = disease;
    }

}
