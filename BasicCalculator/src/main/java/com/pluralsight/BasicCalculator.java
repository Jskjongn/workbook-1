package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        // imported and created the scanner
        Scanner myScanner = new Scanner(System.in);

        // asks user for first number
        System.out.println("Enter the first number: ");
        float num1 = myScanner.nextFloat();

        // asks user for second number
        System.out.println("Enter the second number: ");
        float num2 = myScanner.nextFloat();

        // eats leftover from Int
        myScanner.nextLine();

        // lists possible calculations
        System.out.println("Possible calculations: \n (A)dd\n (S)ubtract\n (M)ultiply\n (D)ivide");

        // asks user to choose what calculation
        // for this exercise it will always multiply (M)
        System.out.println("Please select an option: ");
        String option = myScanner.nextLine();

        // multiplies the two user's numbers
        float total = num1 * num2;

        // displays total to user with user's numbers
        System.out.println(num1 + " * " + num2 + " = " + total);

    }

}
