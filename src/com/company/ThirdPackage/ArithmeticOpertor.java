package com.company.ThirdPackage;

public class ArithmeticOpertor {

    public static void main(String[] args) {
        int a=10, b=20, c=30;

        int sum = a + b + c;
        int difference = a - b - c ;
        int multiplication = a * b * c;
        int division = (a / b) / c;
        int modulus = a%b;

        System.out.println("The sum is " + sum );
        System.out.println("difference" + difference);
        System.out.println("multiplication "   + multiplication);
        System.out.println("division "  + division);
        System.out.println("my total is " + (a+b));//(a+b)
        System.out.println("modulus " + modulus);// (a%b)

    }
}
