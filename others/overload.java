public class overload {
    public static double add(int a,double b){
        double sum = a + b;
        return sum;
    }

    public static void add(double a,int b){
        double sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        double sum = add(10, 12.0);
        System.out.println(sum);
        add(10.0, 1);
    }
}
