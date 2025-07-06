package com.oops;

import java.util.Scanner;

public class EncapMain {
    public static void main(String[] args) {

        /*Without Encapsulation */

        // WithoutEncap obj = new WithoutEncap();
        // obj.CustName = "Aman";
        // obj.mobno =5352364;
        // obj.accbal= 550;

        // System.out.println(obj.CustName);
        // System.out.println(obj.accbal);
        // obj.accbal = 1000;
        // System.out.println(obj.accbal);
        // System.out.println(obj.mobno);

        // // Scanner sc = new Scanner(System.in);
        // // System.out.print("Enter amount to withdraw: ");
        // // double amount = sc.nextDouble();

        // obj.withdraw(990);
        // obj.accbal = 1000;               // Here because of public modifiers , it allowed to change values 
        // obj.withdraw(1000);




        /* With Encapsulation */


        WithEncap obj1 = new WithEncap("Aman1", 7435334, 1000);
        // System.out.println(obj1.getAccbal());
        // System.out.println(obj1.getCustName());
        // System.out.println(obj1.getMobno());
        obj1.withdraw(990);
        obj1.withdraw(100);










    }
}
