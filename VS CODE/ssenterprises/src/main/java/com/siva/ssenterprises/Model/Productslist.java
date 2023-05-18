package com.siva.ssenterprises.Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productslist")
public class Productslist implements Serializable {

    public static final long serialVersionUID=1L;

    @Id
    private int pid;

    @Column(name="productname")
    private String productname;

    @Column(name="unit")
    private String unit;

    @Column(name="rate")
    private double rate;

    public Productslist() {
    }

    public Productslist(int pid, String productname, String unit, double rate) {
        this.pid = pid;
        this.productname = productname;
        this.unit = unit;
        this.rate = rate;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProductname() {
        return productname;
    }

    @Override
    public String toString() {
        return "Productslist [pid=" + pid + ", productname=" + productname + ", unit=" + unit + ", rate=" + rate + "]";
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
}
