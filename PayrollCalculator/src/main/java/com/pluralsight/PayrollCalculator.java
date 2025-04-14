package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        // imports and creates new scanner
        Scanner myScanner = new Scanner(System.in);

        // asks user their name
        System.out.println("What is your name? ");
        String name = myScanner.nextLine();

        // greets user with their name
        System.out.println("Greetings, " + name);

        // asks user the number of hours they worked
        System.out.println("Enter number of hours worked: ");
        float hours = myScanner.nextFloat();

        // asks user their pay rate
        System.out.println("Enter pay rate: ");
        float payRate = myScanner.nextFloat();

        // calculates gross pay by multiplying hours and pay rate together
        float grossPay = hours * payRate;

        // displays the user's name and their gross pay
        // System.out.println(name + " your gross pay is: " + grossPay);

        // calculating overtime pay
        // overtime is hours over 40 times 1.5
        if (hours > 40) {
            System.out.println(name + " your gross pay with overtime is: " + grossPay * 1.5f);
        } else {
            System.out.println(name + " your gross pay is: " + grossPay);
        }

    }



}
