public class shareddigit{    
    public static void main(String[] args) {        
        System.out.println(hasSharedDigit(12, 23));        
        System.out.println(hasSharedDigit(11, 91));        
        System.out.println(hasSharedDigit(115, 55));         
    }    
    public static boolean hasSharedDigit(int a, int b) {
        if((a<10||a>99)||(b<10||b>99)){
            return false;
        }
                boolean answer = false;        
                int lefta = a/10;        
                int righta = a % 10;        
                int leftb = b/10;        
                int rightb = b % 10;        
                if(lefta == leftb || lefta == rightb || righta == leftb || righta == rightb){           
 answer = true;          }
 return answer;    }}