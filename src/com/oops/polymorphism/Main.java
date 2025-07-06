package com.oops.polymorphism;


public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Cricket cricket = randomMatch();
            System.out.println("The formatname at " + i + " is "+ cricket.formatname +" . The rule is : "+ cricket.rule());
        }
    }

    public static Cricket randomMatch(){
        int randomnumber = (int)((Math.random()*5) + 1);

        System.out.println("The random number is: "+randomnumber);

        switch (randomnumber) {
            case 1:
                return new Testmatch();
            case 2:
                return new OneDay();
            case 3:
                return new T20();
            case 4: 
                return new Ipl();
            case 5: 
                return new Gully();
            default: 
                return null;
            
        }
    } 

}
