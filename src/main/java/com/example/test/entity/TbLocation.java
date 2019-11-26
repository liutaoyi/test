package com.example.test.entity;

import java.util.Date;

public class TbLocation {
    private Long code;

    private String address;

    private Date locationTime;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getLocationTime() {
        return locationTime;
    }

    public void setLocationTime(Date locationTime) {
        this.locationTime = locationTime;
    }

    @Override
    public String toString() {
        return "TbLocation{" +
                "code=" + code +
                ", address='" + address + '\'' +
                ", locationTime=" + locationTime +
                '}';
    }
}