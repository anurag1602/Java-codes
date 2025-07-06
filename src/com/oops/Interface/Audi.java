package com.oops.Interface;

public class Audi implements ICar {

    private String BuildYear;
    private boolean engineOn;


    public Audi(String BuildYear,boolean engineOn){
        this.BuildYear = BuildYear;
        this.engineOn = engineOn;
    }

    
    public void noofseats(){
        System.out.println("It has 4 seats");
    }

    public void engineOnorOff(){
        if(engineOn==true){
            System.out.println("Engine is On"+" and build year is "+ BuildYear);
        }else{
            System.out.println("Engine is Off"+" and build year is "+ BuildYear);
        }
    }

    public void seatQuality(){
        System.out.println("It has high quality seats");
    }

    public void steeingwheel(){

    }

    public void FuelTankSize(){

    }

}
