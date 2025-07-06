package com.composition;

public class Library {
    private String LibraryName;
    private Floor floor;

    public Library(String LibraryName,Floor floor){
        this.LibraryName = LibraryName;
        this.floor = floor;
    }

    public String getLibraryName(){
        return LibraryName;
    }

    public Floor getFloor(){
        return floor;
    }

}
