package com.composition;

public class Student {
    private String StudName;
    private String Rollno;

    public Student(String StudName,String Rollno){
        this.StudName = StudName;
        this.Rollno = Rollno;
    }

    public String getStudName(){
        return StudName;
    }

    public String getRollno(){
        return Rollno;
    }
}
