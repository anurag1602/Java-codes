package com.company;



public class MainScope {
    private int privatevariable = 10;

    public static void main(String[] args) {

        int privatevariable = 12;

        ScopeofVar scope = new ScopeofVar();

        // scope.checkScope();

        // System.out.println(scope.privatevariable);


        System.out.println("The private variable is: "+scope.getprivatevariable());


        MainScope main = new MainScope();
        System.out.println("The private variable is: "+ main.privatevariable);

        System.out.println(privatevariable);

       


        scope.Multiplier();



        ScopeofVar.InnerScopeofVar InScope =scope.new InnerScopeofVar();   // object created for Inner class

        InScope.checkInnerScope();

        InScope.Multiplier();


        scope.accessingInner();


        System.out.println("The Inner class variable is: "+ InScope.getprivatevariable() );
    }
}
