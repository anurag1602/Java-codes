package com.oops.Interface;

public class Merc implements ICar{
    
    private String BuildYear;
    private boolean engineOn;


    public Merc(String BuildYear,boolean engineOn){
        this.BuildYear = BuildYear;
        this.engineOn = engineOn;
    }

    public void noofseats(){
        System.out.println("It has 4 seats for merc");
    }

    public void engineOnorOff(){
        if(engineOn==true){
            System.out.println("Engine is On for merc"+ " and build year is "+ BuildYear);
        }else{
            System.out.println("Engine is Off for merc"+" and build year is "+ BuildYear);
        }
    }

    public void seatQuality(){
        System.out.println("It has high quality seats for merc");
    }

    public void steeingwheel(){

    }

    public void FuelTankSize(){

    }


}
