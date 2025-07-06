public class odddigitsum {
    public static void main(String[] args) {
        System.out.println(getOddDigitSum(123456789));
        System.out.println(getOddDigitSum(252));
        System.out.println(getOddDigitSum(-22));
    }

    // public static boolean isodd(int num){
    //     if(num%2==1){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }


    public static int getOddDigitSum(int num){
        if(num<0){
            return -1;
        }
        int sum = 0;
        while(num!=0){
            int rem = num % 10;
            if(rem%2==1){
                sum = sum + rem;
            }
            num = num/10;
        }

        return sum;
    }


}
