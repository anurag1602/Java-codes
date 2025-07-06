import java.util.Scanner;
public class Evensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Start: ");
        int start = sc.nextInt();
        System.out.println("Enter the End: ");
        int end = sc.nextInt();
        int sum =sumEven(start, end);
        System.out.println("Sum is: "+sum);

        sc.close();
    }

    public static boolean isEven(int num){
        if(num>0){
            if(num%2==0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }


    public static int sumEven(int start,int end){
        int sum = 0;
        if((end>=start)&&start>=0){
                for(int i=start;i<=end;i++){
                    if(isEven(i)){
                        sum = sum + i;
                    }
                }return sum;
        }else{
            return -1;
        }

    }
}
