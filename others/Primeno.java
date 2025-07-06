import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        if(n>1&&n<1000){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                sum = sum + i;
            }
        }
    }
        System.out.println(sum);
    }

    
    public static boolean isprime(int i){
        int count = 0;
        for(int j=2;j<i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }else{
            return false;
        }    
    }
        
}

