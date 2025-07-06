package com.oops;

public class WithoutEncap {
    public String CustName;
    public double mobno;
    public double accbal;


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
