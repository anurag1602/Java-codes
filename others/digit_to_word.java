public class digit_to_word{
    public static void main(String[] args) {
        numberToWords(200);
    }

    public static void numberToWords(int num){
        int rem;
        while(num!=0){
            rem = num % 10;
            switch (rem) {
                case 1:
                    System.out.print("One" + " ");
                    break;
                case 2:
                    System.out.print("Two"+ " ");
                    break;
                case 3:
                    System.out.print("Three"+ " ");
                    break;
                case 4:
                    System.out.print("Four"+ " ");
                    break;
                case 5:
                    System.out.print("Five"+ " ");
                    break;
                case 6:
                    System.out.print("Six"+ " ");
                    break;
                case 7:
                    System.out.print("Seven"+ " ");
                    break;
                case 8:
                    System.out.print("Eight"+ " ");
                    break;
                case 9:
                    System.out.print("Nine"+ " ");
                    break;
                default:
                    System.out.print("Zero"+ " ");
                    break;
            }

            num = num / 10;
        }
    }


}    