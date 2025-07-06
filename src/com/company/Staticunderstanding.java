package com.company;

public class Staticunderstanding {
    public int Empno;
    public String Empname;
    public static String CompanyName = "Google";

    public Staticunderstanding(int Empno,String Empname){
        this.Empno = Empno;
        this.Empname = Empname;
    }

    public void details(){
        System.out.println("The emp no is: "+ Empno + " The Emp name is: "+ Empname + " The company name is: "+CompanyName);
    }
    
}
