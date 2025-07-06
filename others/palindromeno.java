public class palindromeno {
    public static void main(String[] args) {
        ispalindrome(1234321);
    }

    public static void ispalindrome(int num){
        int temp = num;
        int rev = 0;
        while(num!=0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(temp == rev){
            System.out.println(temp + " is a palindrome number");
        }else{
            System.out.println(temp + " is not a palindrome number");
        }
    }
}
