package com.oops;

public class WithEncap {
    private String CustName;
    private double mobno;
    private double accbal;


    public WithEncap(String CustName,double mobno,double accbal){
        this.CustName = CustName;
        this.mobno = mobno;
        this.accbal = accbal;
    }


    // public String getCustName() {
    //     return CustName;
    // }

    // public double getMobno() {
    //     return mobno;
    // }


    // public double getAccbal() {
    //     return accbal;
    // }



    public void withdraw(double amount){
        if(accbal < amount){
            System.out.println("Insufficient Balance to withdraw");
        }else{
            System.out.println("Thanks for withdrawing");
            accbal = accbal - amount;
            System.out.println("the remaining balance is: "+accbal);
        }
    }
}
