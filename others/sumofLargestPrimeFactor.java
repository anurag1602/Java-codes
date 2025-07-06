public class sumofLargestPrimeFactor {
    public static void main(String[] args) {
        int n = 10;
        for(int i=2;i<=n;i++){
            largestprime(i);
        }                                 // Correct it after learning 
    }

    public static void largestprime(int i){
        for(int j=2;j<=i;j++){
            if(i%j==0){
                System.out.println(j);
            }
        }
              
    }
}
