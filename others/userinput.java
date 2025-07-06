import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name");
        String Name = sc.nextLine();
        System.out.println(age);
        System.out.println(Name);

        sc.close();
    }
}
