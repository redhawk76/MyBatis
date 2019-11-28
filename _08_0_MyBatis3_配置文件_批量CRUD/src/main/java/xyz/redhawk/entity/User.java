package xyz.redhawk.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String user_name;

    private String sex;

    private Integer empId;

    private Date entry_time;

    private String address;

    private Date birthday;

    private Float salary;

    private Long annual_alary;

    private Byte dimission;

    private String role;

    private Date calendar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Long getAnnual_alary() {
        return annual_alary;
    }

    public void setAnnual_alary(Long annual_alary) {
        this.annual_alary = annual_alary;
    }

    public Byte getDimission() {
        return dimission;
    }

    public void setDimission(Byte dimission) {
        this.dimission = dimission;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Date getCalendar() {
        return calendar;
    }

    public void setCalendar(Date calendar) {
        this.calendar = calendar;
    }
}