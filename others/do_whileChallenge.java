public class do_whileChallenge {
    public static void main(String[] args) {
        int n = 13412;
        int temp =13412;
        int sum = 0;
        do{
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }while(n!=0);
        System.out.println("Sum of digits of "+temp +" is "+sum);
    } 
}
