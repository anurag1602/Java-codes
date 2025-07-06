public class Constructor_Challenge {
    private String Stud_Name;
    private int Roll_no;
    private String Stud_std;
    private char Stud_sec;


    public Constructor_Challenge(){
        this("Aman",11,"7th",'B');
        System.out.println("Default Constructor was Called");
    }

    public Constructor_Challenge(String Stud_Name,int Roll_no,String Stud_std,char Stud_sec){
        this.Stud_Name = Stud_Name;
        this.Roll_no = Roll_no;
        this.Stud_std = Stud_std;
        this.Stud_sec = Stud_sec;
        System.out.println("Constructor Called");
    }

    public Constructor_Challenge(String Stud_Name,int Roll_no){
        this(Stud_Name,Roll_no,"8th",'A');
        System.out.println("Other constructor called");
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public String getStud_Name() {
        return Stud_Name;
    }

    public char getStud_sec() {
        return Stud_sec;
    }

    public String getStud_std() {
        return Stud_std;
    }

    
    public static void main(String[] args) {
        Constructor_Challenge first = new Constructor_Challenge();

        System.out.println(first.getStud_Name());
        System.out.println(first.getRoll_no());
        System.out.println(first.getStud_std());
        System.out.println(first.getStud_sec());


        Constructor_Challenge second = new Constructor_Challenge("Ashish",15);

        System.out.println(second.getStud_Name());
        System.out.println(second.getRoll_no());
        System.out.println(second.getStud_std());
        System.out.println(second.getStud_sec());


        Constructor_Challenge third = new Constructor_Challenge("Sarang",14,"9th",'B');

        System.out.println(third.getStud_Name());
        System.out.println(third.getRoll_no());
        System.out.println(third.getStud_std());
        System.out.println(third.getStud_sec());



    }
}
