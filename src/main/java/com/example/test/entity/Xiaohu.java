package com.example.test.entity;

import java.util.Date;

public class Xiaohu {
    private Long code;

    private Boolean flag;

    private Date finishTime;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "Xiaohu{" +
                "code=" + code +
                ", flag=" + flag +
                ", finishTime=" + finishTime +
                '}';
    }
}