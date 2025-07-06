package com.composition;

public class Compositionmain {
    public static void main(String[] args) {
        Student student1 = new Student("Raj", "#123");
        // System.out.println(student1.getStudName());
        // System.out.println(student1.getRollno());

        Sessions session1 = new Sessions("2021-2022", new Student("Rohit", "#234"));
        Sessions session2 = new Sessions("2022-2023", student1);      //New Student obj created on above line
        // System.out.println(session1.getSessionName());
        // System.out.println(session1.getStudent().getStudName());
        // System.out.println(session1.getStudent().getRollno());
        // System.out.println(session2.getSessionName());
        // System.out.println(session2.getStudent().getStudName());
        // System.out.println(session2.getStudent().getRollno());

        Floor floor1 = new Floor(1, 1000000);
        // System.out.println(floor1.getfloorno());
        // System.out.println(floor1.getfloorcapacity());
        // floor1.floorinin();


        Library lib1 = new Library("bestlib1", new Floor(2, 2000000));
        Library lib2 = new Library("bestlib2", floor1);

        // System.out.println(lib1.getLibraryName());
        // System.out.println(lib1.getFloor().getfloorno());
        // System.out.println(lib1.getFloor().getfloorcapacity());

        // System.out.println(lib2.getLibraryName());
        // System.out.println(lib2.getFloor().getfloorno());
        // System.out.println(lib2.getFloor().getfloorcapacity());


        Branch br1 = new Branch("IT", new Sessions("2023-2024", new Student("Ayush", "#567")));
        Branch br2 = new Branch("CSE", session1);
        Branch br3 = new Branch("EXTC", session2);
        // System.out.println(br3.getBranchName());
        // System.out.println(br3.getSession().getSessionName());
        // System.out.println(br3.getSession().getStudent().getStudName());
        // System.out.println(br3.getSession().getStudent().getRollno());


        // System.out.println(br2.getBranchName());
        // System.out.println(br2.getSession().getSessionName());
        // System.out.println(br2.getSession().getStudent().getStudName());
        // System.out.println(br2.getSession().getStudent().getRollno());

        
        // System.out.println(br1.getBranchName());
        // System.out.println(br1.getSession().getSessionName());
        // System.out.println(br1.getSession().getStudent().getStudName());
        // System.out.println(br1.getSession().getStudent().getRollno());


        College clg1 = new College("Dlj", new Branch("Civil", new Sessions("2024-2025", new Student("Utu", "#7667"))), new Library("bestlib3", new Floor(3, 3000000)));
        College clg2 = new College("lkh", new Branch("Mechanical", new Sessions("2024-2025", new Student("Shri", "#1268"))), new Library("bestlib4", new Floor(4, 4000000)));
        College clg3 = new College("prm", br3, lib2);
        College clg4 = new College("prmi", br2, lib1);
        College clg5 = new College("prmit", br1, lib1);

        // System.out.println(clg3.getCollegeName());
        // System.out.println(clg3.getBranch().getBranchName());
        // System.out.println(clg3.getBranch().getSession().getSessionName());
        // System.out.println(clg3.getBranch().getSession().getStudent().getStudName());
        // System.out.println(clg3.getBranch().getSession().getStudent().getRollno());
        // System.out.println(clg3.getLibrary().getLibraryName());
        // System.out.println(clg3.getLibrary().getFloor().getfloorno());
        // System.out.println(clg3.getLibrary().getFloor().getfloorcapacity());
        


        // System.out.println(clg2.getCollegeName());
        // System.out.println(clg2.getBranch().getBranchName());
        // System.out.println(clg2.getBranch().getSession().getSessionName());
        // System.out.println(clg2.getBranch().getSession().getStudent().getStudName());
        // System.out.println(clg2.getBranch().getSession().getStudent().getRollno());
        // System.out.println(clg2.getLibrary().getLibraryName());
        // System.out.println(clg2.getLibrary().getFloor().getfloorno());
        // System.out.println(clg2.getLibrary().getFloor().getfloorcapacity());
        
        // System.out.println(clg1.getCollegeName());
        // System.out.println(clg1.getBranch().getBranchName());
        // System.out.println(clg1.getBranch().getSession().getSessionName());
        // System.out.println(clg1.getBranch().getSession().getStudent().getStudName());
        // System.out.println(clg1.getBranch().getSession().getStudent().getRollno());
        // System.out.println(clg1.getLibrary().getLibraryName());
        // System.out.println(clg1.getLibrary().getFloor().getfloorno());
        // System.out.println(clg1.getLibrary().getFloor().getfloorcapacity());


        University uv1 = new University("sgb", new College("Prmitr", new Branch("Information Tchnology", new Sessions("current 2025", new Student("Anu","#787437"))), new Library("new lib", new Floor(5, 5000000))));
        University uv2 = new University("sgbau", clg5);

        System.out.println(uv2.getUnivName());
        System.out.println(uv2.getCollege().getCollegeName());
        System.out.println(uv2.getCollege().getBranch().getBranchName());
        System.out.println(uv2.getCollege().getBranch().getSession().getSessionName());
        System.out.println(uv2.getCollege().getBranch().getSession().getStudent().getStudName());
        System.out.println(uv2.getCollege().getBranch().getSession().getStudent().getRollno());
        System.out.println(uv2.getCollege().getLibrary().getLibraryName());
        System.out.println(uv2.getCollege().getLibrary().getFloor().getfloorno());
        System.out.println(uv2.getCollege().getLibrary().getFloor().getfloorcapacity());


        // System.out.println(uv1.getUnivName());
        // System.out.println(uv1.getCollege().getCollegeName());
        // System.out.println(uv1.getCollege().getBranch().getBranchName());
        // System.out.println(uv1.getCollege().getBranch().getSession().getSessionName());
        // System.out.println(uv1.getCollege().getBranch().getSession().getStudent().getStudName());
        // System.out.println(uv1.getCollege().getBranch().getSession().getStudent().getRollno());
        // System.out.println(uv1.getCollege().getLibrary().getLibraryName());
        // System.out.println(uv1.getCollege().getLibrary().getFloor().getfloorno());
        // System.out.println(uv1.getCollege().getLibrary().getFloor().getfloorcapacity());

        
    }
}
