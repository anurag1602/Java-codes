package com.composition;

public class Sessions {
    private String SessionName;
    private Student student;

    public Sessions(String SessionName,Student student){
        this.SessionName = SessionName;
        this.student = student;
    }

    public String getSessionName() {
        return SessionName;
    }

    public Student getStudent(){
        return student;
    }
}
