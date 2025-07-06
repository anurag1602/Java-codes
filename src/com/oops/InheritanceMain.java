package com.oops;

public class InheritanceMain {
    public static void main(String[] args) {
        Inheritance pobj = new Inheritance("10yrs", 200, "2020");


        ChildInheritance cobj = new ChildInheritance("Tata", "Yes", "1.5inch", "20yrs", 150);


        // pobj.movement();
        // cobj.movement();

        // pobj.speed(50);
        cobj.carspeed(60);

        childchild1 ch = new childchild1("RangeRover", "Yes", "Yes", "1.9inch", "20yrs");
        ch.movement();
    }
}
