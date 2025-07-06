package com.company;

import java.util.Scanner;

public class prac {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double CGPA = sc.nextDouble();

        System.out.println("Hii "+ name + ", you are "+ age + " years old and your CGPA is "+ CGPA);

    }
}
