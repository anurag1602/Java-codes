import java.util.Scanner;

public class Student {
 
    private String FirstName;
    private String LastName;
    private int marks;

    // public Student(){
    //     this("Rohan", "Panwar", 95);
    //     System.out.println("Default Constructor was called");
    // }

    // public Student(String FirstName,String LastName,int marks){
    //     this.FirstName = FirstName;
    //     this.LastName = LastName;
    //     this.marks = marks;
    //     System.out.println("Constructor called");
    // }



    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public String getFirstName(){
        return FirstName;
    }

    public void setLastname(String Lastname){
        this.LastName = Lastname;
    }

    public String getLastName(){
        return LastName;
    }

    public void setmarks(int marks){
        if(marks<0 || marks>100){
            this.marks = 0;
        }else{
            this.marks = marks;
        }
    }

    public int getmarks(){
        return marks;
    }


    public boolean isPass(){
        if(marks>=33 && marks<=100){
            return true;
        }else{
            return false;
        }
    }


    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }

 


    public static void main(String[] args) {
    Student data = new Student();

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter FirstName");
    // String FirstName = sc.nextLine();
    // System.out.println("Enter LastName");
    // String LastName = sc.nextLine();
    // System.out.println("Enter marks");
    // int marks = sc.nextInt();

    // data.setFirstName(FirstName);
    // data.setLastname(LastName);
    // data.setmarks(marks);

    data.setFirstName("");
    data.setLastname("");
    data.setmarks(10);


    System.out.println("Pass="+data.isPass());
    System.out.println("FullName="+data.getFullName());


    data.setFirstName("Sudhir");
    data.setmarks(80);
    System.out.println("Pass="+data.isPass());
    System.out.println("FullName="+data.getFullName());

    data.setLastname("Dhangar");
    System.out.println("FullName="+data.getFullName());

    // System.out.println(data.getmarks());
 }   
}