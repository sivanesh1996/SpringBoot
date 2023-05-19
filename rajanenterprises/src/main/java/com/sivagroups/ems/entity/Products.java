package com.sivagroups.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;


    @Column(name ="pname",nullable = false)
    private String pname;

    @Column(name="unit")
    private String unit;

    @Column(name="rate")
    private Double rate;

    
    public Products() {
    }


    public Products(String pname, String unit, Double rate) {
        super();
        this.pname = pname;
        this.unit = unit;
        this.rate = rate;
    }
   
    public Integer getPid() {
        return pid;
    }
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public Double getRate() {
        return rate;
    }
    public void setRate(Double rate) {
        this.rate = rate;
    }

    

}
