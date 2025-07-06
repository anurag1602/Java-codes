package com.composition;

public class University {
    private String UnivName;
    private College college;

    public University(String UnivName, College college){
        this.UnivName = UnivName;
        this.college = college;
    }

    public String getUnivName() {
        return UnivName;
    }

    public College getCollege() {
        return college;
    }
}
