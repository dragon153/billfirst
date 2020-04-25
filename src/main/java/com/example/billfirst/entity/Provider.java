package com.example.billfirst.entity;

import java.util.Date;

public class Provider {

    private Integer pid;
    private String providerName;
    private String contactPeople;
    private String phone;
    private String address;
    private String describe;
    private Date createDate;

    @Override
    public String toString() {
        return "Provider{" +
                "pid=" + pid +
                ", providerName='" + providerName + '\'' +
                ", contactPeople='" + contactPeople + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", describe='" + describe + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getContactPeople() {
        return contactPeople;
    }

    public void setContactPeople(String contactPeople) {
        this.contactPeople = contactPeople;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
