package com.company;

class abcd {

    abcd(){
        System.out.println("Constructor Called");
    }
    static {
        System.out.println("Static block exe");
    }
}

public class StaticinitMain {


    static {
        System.out.println("Staic block running");
    }
    public static void main(String[] args) {
        System.out.println("Main method called");
        
        Staticinit obj = new Staticinit();
        
        obj.method1();
        obj.method2();
        
        abcd a = new abcd();
    }
}
