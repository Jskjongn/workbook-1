package com.pluralsight;

import java.util.Scanner;

public class AdditionCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // let's greet our user
        System.out.println("Welcome to my Simple Calculator!");

        // asks user for first number
        System.out.println("Whats your first number? ");
        int num1 = myScanner.nextInt();

        // asks user for second number
        System.out.println("Whats your first number? ");
        int num2 = myScanner.nextInt();

        // adds the two user numbers
        int sum = num1 + num2;

        // displays users numbers added together
        System.out.println("The total is: " + sum);

    }

    // another way to do the addition
    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }

}
