package com.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scan.nextDouble();
        System.out.println("Enter b:");
        b = scan.nextDouble();

        //Begin Calculation
        Rectangle rect = new Rectangle();
        System.out.println(" The area of the rectangle is: "+ rect.calcArea(a, b));
        System.out.println(" The perimeter of the rectangle is: "+ rect.calcPerimeter(a, b));
    }
}
