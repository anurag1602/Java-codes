import java.util.Scanner;

public class forloopcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to print table of: ");
        int num = sc.nextInt();
        for(int i=10;i>=1;i--){
        table(i, num);
    }
}

    public static void table(int i,int num){
        System.out.println(num +"*"+ i+ "="+num * i);
    }
}
