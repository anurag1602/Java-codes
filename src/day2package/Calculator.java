package day2package;

public class Calculator {
    double a;
    double b;

    // public Calculator(double a,double b){
    //     this.a = a;
    //     this.b = b;
    // }

    public static double add(double a,double b){
        double sum = a + b;
        return sum;
    }

    public static double sub(double a,double b){
        double sub = a-b;
        return sub;
    }

    public static double mul(double a,double b){
        double mul = a*b;
        return mul;
    }

    public static double div(double a, double b){
        double div = a/b;
        return div;
    }
    
}
