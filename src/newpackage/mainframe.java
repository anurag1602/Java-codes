package newpackage;

import java.util.Scanner;

import day2package.Calculator;
import day2package.scientificCalc;

// import day2package.*;

public class mainframe {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        scientificCalc scal = new scientificCalc();


        // System.out.println(cal.add());
        // System.out.println(cal.sub());
        // System.out.println(cal.mul());
        // System.out.println(cal.div());


        // System.out.println(scal.power());



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two no:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();


        double sum = Calculator.add(a, b);
        System.out.println("The sum is: "+sum);

        double subt = Calculator.sub(a, b);
        System.out.println("The sub is: "+subt);


        double mul = Calculator.mul(a, b);
        System.out.println("The Multiplication is: "+ mul);


        double div = Calculator.div(a,b);
        System.out.println("The division is: "+ div);



        double pow = scientificCalc.power(a,b);
        System.out.println("The power is: "+pow);



        sc.close();
    }
}
