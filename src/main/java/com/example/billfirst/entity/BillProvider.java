package com.example.billfirst.entity;

public class BillProvider extends Bill{

    private String providerName;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public String toString() {
        return "BillProvider{" +
                "providerName='" + providerName + '\'' +
                '}';
    }
}
