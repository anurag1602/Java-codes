package com.oops.polymorphism;


public class Cricket {
    public String formatname;

    public Cricket(String formatname){
        this.formatname = formatname;
    }

    public String rule(){
        return "Cricket is a game played between two teams having 11 players each";
    }
}



class Testmatch extends Cricket {

    public Testmatch(){
        super("Test");
    }

    public String rule(){
        return "Played for 5 days no fixed overs overall";
    }
}



class OneDay extends Cricket {

    public OneDay(){
        super("OneDay");
    }

    public String rule(){
        return "Played for whole day for 50 overs allocated to each team";
    }

}



class T20 extends Cricket {

    public T20(){
        super("T20");
    }

    public String rule(){
        return "Played for 40 overs in total 20 overs for each team";
    }

}


class Ipl extends Cricket {

    public Ipl(){
        super("Ipl");
    }

    public String rule(){
        return "Played for Entertainment and creates opportunities for new talents same like t20";
    }

}


class Gully extends Cricket {

    public Gully(){
        super("Gully");
    }
}