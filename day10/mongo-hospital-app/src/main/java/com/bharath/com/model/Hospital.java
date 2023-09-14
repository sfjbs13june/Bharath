package com.bharath.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Hospital {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="hospitalname")
    private string hospitalname;

    @Column(name="address")
    private string address;

    public Hospital(){


      public Integer getId(){ return id; }

        public void setId(Integer id) { this.id = id;}

        public String gethospitalname() { return hospitalname; }

        public void setHospitalname(String hospitalname) { this.hospitalname = hospitalname; }

        public String getaddress() { return address; }

        public void setAddress(String address) { this.address = address;}


    }

}
