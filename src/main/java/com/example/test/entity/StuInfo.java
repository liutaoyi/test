package com.example.test.entity;

import java.util.Date;

public class StuInfo {
    private Long id;

    private String stuNum;

    private String name;

    private Integer classNum;

    private String sex;

    private Date birth;

    private String className;

    private String teacherName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum == null ? null : stuNum.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    @Override
    public String toString() {
        return "StuInfo{" +
                "id=" + id +
                ", stuNum='" + stuNum + '\'' +
                ", name='" + name + '\'' +
                ", classNum=" + classNum +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", className='" + className + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}