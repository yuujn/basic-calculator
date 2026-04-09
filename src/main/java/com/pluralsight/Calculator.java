package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double second = scan.nextDouble();
        System.out.println();
        System.out.println("Possible calculations:");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");
        System.out.print("Please select an option: ");
        String option = scan.next().toUpperCase();
        if (option.equals("A")) {
            System.out.printf("%f + %f = %f", first, second, first + second);
        } else if (option.equals("S")) {
            System.out.printf("%f - %f = %f", first, second, first - second);
        } else if (option.equals("M")) {
            System.out.printf("%f * %f = %f", first, second, first * second);
        } else if (option.equals("D")) {
            System.out.printf("%f / %f = %f", first, second, first / second);
        } else {
            System.out.print("Invalid option.");
        }
        System.out.println();
    }
}
