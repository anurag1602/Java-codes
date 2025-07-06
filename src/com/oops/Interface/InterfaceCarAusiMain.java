package com.oops.Interface;

public class InterfaceCarAusiMain {
    

    public static void main(String[] args) {
        
        ICar mynewCar;
        mynewCar = new Audi("2020",true);

        mynewCar.engineOnorOff();
        mynewCar.seatQuality();

        mynewCar = new Audi("2024", false);
        mynewCar.engineOnorOff();


        mynewCar = new Merc("2022", true);

        mynewCar.engineOnorOff();
        mynewCar.seatQuality();



    }




}
