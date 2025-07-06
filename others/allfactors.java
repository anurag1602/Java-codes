public class allfactors{
    public static void main(String args[]){
        printfactors(6);
        printfactors(10);
        printfactors(30);
        printfactors(-1);
    }


    public static void printfactors(int num){
        if(num<1){
            System.out.print("Invalid value");
        }else{
            for(int i=1; i<=num; i++){
                if(num % i == 0){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}
