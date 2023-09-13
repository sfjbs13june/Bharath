package com.bharath.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="patientname")
    private string patientname;

    @Column(name="Hname")
    private string Hname;
    @Column(name="disease")
    private string disease;

    public patient(){

        public Integer getId(){ return id; }

        public void setId(Integer id) { this.id = id;}

        public String getpatientname() { return patientname; }

        public void setPatientname(String patientname) { this.patientname = patientname; }

        public String gethospitalname() { return hospitalname; }

        public void setHospitalname(String hospitalname) { this.hospitalname = hospitalname; }

        public String getdisease() { return disease; }

        public void setDisease(String disease) { this.disease = disease;}


    }


}
