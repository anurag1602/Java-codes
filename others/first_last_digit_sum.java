public class first_last_digit_sum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(352));
        System.out.println(sumFirstAndLastDigit(1));
        System.out.println(sumFirstAndLastDigit(-7));
    }

    public static int sumFirstAndLastDigit(int num){
        int first = 0;
        int last = num % 10;
        num = num / 10;
        while(num!=0){
            if(num/10==0){
                first = num % 10;
            }
            num = num / 10;
        }

        return first + last;

    }
}
