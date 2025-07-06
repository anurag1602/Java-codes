package com.oops;

public class ChildInheritance extends Inheritance {
    private String Brandname;
    private String Steeringwheel;
    private String GroundClearance;


    public ChildInheritance(String Brandname,String Steeringwheel,String GroundClearance,String durability,double topspeed){
        super(durability, topspeed,"2014");         //Default
        this.Brandname = Brandname;
        this.Steeringwheel = Steeringwheel;
        this.GroundClearance = GroundClearance;

    }


    public void movement(){                      
        System.out.println("method car.movement was called");
        // super.movement();                            // method overridden and calling parent method here using super 
    }


    public void carspeed(int speed){
        System.out.println("the carspeed method called");
        super.speed(speed);     // calling super class speed method
        // speed(speed);         // calling child class overridden speed method present below
    }


    public void speed(int speed){
        System.out.println("the car speed is : "+speed);
        // super.speed(speed);           // calling super class speed method 
    }



}
