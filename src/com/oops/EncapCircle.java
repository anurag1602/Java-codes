package com.oops;

public class EncapCircle {
    private double radius;


    public EncapCircle(double rad){
        radius = rad;
    }
  

    public double getAreaofCircle(){
        return Math.PI * radius * radius;
    }


    public double getRadius() {
        return radius;
    }

}
