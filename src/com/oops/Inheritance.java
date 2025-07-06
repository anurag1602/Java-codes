package com.oops;

public class Inheritance {
    private String durability;
    private double topspeed;
    private String yearofmanufac;



    public Inheritance(String durability,double topspeed,String yearofmanufac){
        this.durability = durability;
        this.topspeed = topspeed;
        this.yearofmanufac = yearofmanufac;
    }

    public void movement(){
        System.out.println("method Autombile.movement was called ");
    }


    public void speed(int speed){
        System.out.println("The Automobile is moving at the speed of: "+speed);
    }


}
