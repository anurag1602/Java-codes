package com.company;

public class StaticOrder {

    static String msg = show("1st");

    static {
        msg = show("2nd");
    }

    static String show(String value) {
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        System.out.println(msg);

        
        
    }
}

