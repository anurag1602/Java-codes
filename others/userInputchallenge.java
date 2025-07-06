import java.util.Scanner;

public class userInputchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print table : ");
        int n = sc.nextInt();
        printTable(n);

        sc.close();
    }

    public static void printTable(int n){
        int table;
        for(int i = 1; i <= 10; i++){
            table = n * i;
            System.out.println(n + " * " + i + " = "+ table);
        }

        
    }
}
