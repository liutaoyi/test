package com.example.test.entity;

import java.util.Date;

public class Mlxg {
    private Long code;

    private Integer num;

    private Date finishTime;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "Mlxg{" +
                "code=" + code +
                ", num=" + num +
                ", finishTime=" + finishTime +
                '}';
    }
}