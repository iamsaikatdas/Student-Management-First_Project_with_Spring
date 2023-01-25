package com.avengers.StudentManagement;

// 1 - first work.
public class Student {
    private String name;
    private int age;
    private int admissionNo;
    private int rollNo;
    private int className;
    private String address;

    // constructor
    public Student(String name, int age, int admissionNo, int rollNo, int className, String address) {
        this.name = name;
        this.age = age;
        this.admissionNo = admissionNo;
        this.rollNo = rollNo;
        this.className = className;
        this.address = address;
    }

    // getter & setter (get the value and set the value)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(int admissionNo) {
        this.admissionNo = admissionNo;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
