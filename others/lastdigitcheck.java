public class lastdigitcheck {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 9, 71));
        System.out.println(hasSameLastDigit(231, 373, 423));
        System.out.println(hasSameLastDigit(91, 991, 532));
    }
    
    public static boolean hasSameLastDigit(int a,int b,int c){
        if((a<10||a>1000)||(b<10||b>1000)||(c<10||c>1000)){
            return false;
        }else{
            return (a%10==b%10)||(a%10==c%10)||(b%10==c%10);
            }
        
    }
}
