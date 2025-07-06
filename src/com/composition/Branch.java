package com.composition;

public class Branch {
    private String BranchName;
    private Sessions session;

    public Branch(String BranchName,Sessions session){
        this.BranchName = BranchName;
        this.session = session;
    }

    public String getBranchName() {
        return BranchName;
    }

    public Sessions getSession() {
        return session;
    }
}
