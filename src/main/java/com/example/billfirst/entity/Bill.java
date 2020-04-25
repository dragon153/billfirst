package com.example.billfirst.entity;

import java.util.Date;

public class Bill {

    private Integer bid;
    private String billCode;
    private String billName;
    private String billUnit;
    private Integer billNum;
    private Double money;
    //1表示支付，0表示未支付
    private boolean pay;
    //供应商id
    private Integer pid;
    private Date createDate;

    @Override
    public String toString() {
        return "Bill{" +
                "bid=" + bid +
                ", billCode='" + billCode + '\'' +
                ", billName='" + billName + '\'' +
                ", billUnit='" + billUnit + '\'' +
                ", billNum=" + billNum +
                ", money=" + money +
                ", pay=" + pay +
                ", pid=" + pid +
                ", createDate=" + createDate +
                '}';
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillUnit() {
        return billUnit;
    }

    public void setBillUnit(String billUnit) {
        this.billUnit = billUnit;
    }

    public Integer getBillNum() {
        return billNum;
    }

    public void setBillNum(Integer billNum) {
        this.billNum = billNum;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
