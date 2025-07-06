package com.company;

public class TestStatic {
     
    // private static int NoofInst = 0;         
    private int NoofInst = 0;
    private String name;

    public TestStatic(String name){
        this.name = name;
        NoofInst++;
    }

    public int getNoofInst(){
        return NoofInst;
    }

    public String getname(){
        return name;
    }
    
}