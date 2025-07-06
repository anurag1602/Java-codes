package com.composition;

public class Floor {
    private int floorno;
    private double floorcapacity;

    public Floor(int floorno,double floorcapacity){
        this.floorno = floorno;
        this.floorcapacity = floorcapacity;
    }

    public int getfloorno(){
        return floorno;
    }

    public double getfloorcapacity(){
        return floorcapacity;
    }

    // public void floorinin(){
    //     System.out.println("floor is in Library");
    // }

}
