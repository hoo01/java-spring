package com.itheima.module4.dto;

import java.io.Serializable;
//dto - data transfer object
//做好存数据的javabean
public class Calculator implements Serializable {
    private double p;
    private int m;
    private double yr;

    public Calculator(double p, int m, double yr) {
        this.p = p;
        this.m = m;
        this.yr = yr;
    }

    /*public Calculator() {
    }*/

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public double getYr() {
        return yr;
    }

    public void setYr(double yr) {
        this.yr = yr;
    }
}
