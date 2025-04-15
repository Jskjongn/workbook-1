package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        // creates scanner
        Scanner myScanner = new Scanner(System.in);

        // sizes and prices of sandwiches
        int regular = 1;
        int large = 2;
        double regularBasePrice = 5.45;
        double largeBasePrice = 8.95;

        // asks user which sandwich they want
        System.out.println("What size sandwich are you hungry for?\n 1: Regular\n 2: Large\nEnter 1 or 2: ");
        int sandwichSize = myScanner.nextInt();

        // asks user for age to calculate discount
        System.out.println("What is your age? ");
        int age = myScanner.nextInt();

        // if they choose regular or large and are 17 or younger they get student discount
        if (sandwichSize == regular && age <= 17) {
            double studentDiscountReg = regularBasePrice - (.1 * regularBasePrice) ;
            System.out.printf("The cost of your sandwich is: $%.2f", studentDiscountReg);
        } else if (sandwichSize == large &&  age <= 17) {
            double studentDiscountLarge = largeBasePrice - (.1 / largeBasePrice);
            System.out.printf("The cost of your sandwich is: $%.2f", studentDiscountLarge);
        }
        // if they chose regular or large and are 65 and older they get seniors discount
        else if (sandwichSize == regular && age >= 65) {
            double seniorDiscountReg = regularBasePrice - (.2 * regularBasePrice) ;
            System.out.printf("The cost of your sandwich is: $%.2f", seniorDiscountReg);
        } else if (sandwichSize == large &&  age >= 65) {
            double seniorDiscountLarge = largeBasePrice - (.2 / largeBasePrice);
            System.out.printf("The cost of your sandwich is: $%.2f", seniorDiscountLarge);
        }
        // if they chose regular or large and are older than 17 and younger than 64 and old they get no discount
        else if (sandwichSize == regular && age > 17 && age < 65) {
            System.out.println("The cost of your sandwich is: $" + regularBasePrice);
        } else {
            System.out.println("The cost of your sandwich is: $" + largeBasePrice);
        }


    }

}
