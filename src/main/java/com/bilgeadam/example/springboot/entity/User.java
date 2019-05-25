package com.bilgeadam.example.springboot.entity;

import java.util.Date;

public class User {

    private String userName;

    private String password;

    private Integer year;

    private Double salery;

    private Date birthDate;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getSalery() {
        return salery;
    }

    public void setSalery(Double salery) {
        this.salery = salery;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
