public class whilechallenge {
    public static void main(String []args){
        int num = 5;
        printodd(num);
        
    }

    public static boolean isodd(int num){
        if(num%2==1){
            return true;
        }else{
            return false;
        }
    }

    public static void printodd(int num){
        do{
            if(isodd(num)){
                System.out.println(num);
            }
            num++;
        }
        while(num<=30);
    }
}
