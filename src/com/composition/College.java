package com.composition;

public class College {
    private String CollegeName;
    private Branch branch;
    private Library library;

    public College(String CollegeName,Branch branch,Library library){
        this.CollegeName = CollegeName;
        this.branch = branch;
        this.library = library;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public Branch getBranch() {
        return branch;
    }

    public Library getLibrary() {
        return library;
    }
}
