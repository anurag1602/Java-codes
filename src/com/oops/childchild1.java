package com.oops;

public class childchild1 extends ChildInheritance{

    private String name;
    private String headlight;
    private String silencer;


    public childchild1(String name,String headlight,String silencer,String GroundClearance,String durability){
        super("Audi", "Yes",GroundClearance,durability, 300);
        this.name = name;
        this.headlight = headlight;
        this.silencer = silencer;
    }

    public void movement(){
        System.out.println("childchild1 movement");
        super.movement();
        super.carspeed(70);
    }
}
