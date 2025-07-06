package com.company;

public class Staticinit {
    public static final String name;

    static {
        name = " Hello ";
        System.out.println("Static initialized 1");
    }

    Staticinit(){
        System.out.println("Constructor called");
    }

    void method1(){
        System.out.println("method1 called");
    }

    static {
        System.out.println("Static block 2 called");
    }

    void method2(){
        System.out.println("method2 called");
    }
}
