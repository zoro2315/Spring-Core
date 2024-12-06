package com.lu2code.config;

public class Student
{
    private int sid;
    private String name;
    private String address;

    public Student() {
    }

    public Student(int sid, String name, String address) {
        this.sid = sid;
        this.name = name;
        this.address = address;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
