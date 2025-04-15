package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // asks user the date they want
        System.out.println("Please enter a pickup date: ");
        String pickup = myScanner.nextLine();

        // asks user how many days they want to rent
        System.out.println("Number of day(s) for the rental? -- $29.99/day");
        int rentalDays = myScanner.nextInt();

        // eats leftover
        myScanner.nextLine();

        // asks user to enter Y or N answers
        System.out.println("Enter (Y) or (N) for options below:");

        // asks user if they want a toll tag
        System.out.println("Do you want an electronic toll tag? -- $3.95/day");
        String tollTag = myScanner.nextLine();

        // asks user if they want a GPS
        System.out.println("Do you want a GPS? -- $2.95/day");
        String GPS = myScanner.nextLine();

        // asks user if they want roadside
        System.out.println("Do you want roadside assistance? -- $3.95/day");
        String roadside = myScanner.nextLine();

        // asks user how old they are
        System.out.println("What is your age? -- 30% surcharge for drivers under 25");
        int age = myScanner.nextInt();

        System.out.println("----------------------------------------------------------------");

        // takes static method cost of days and puts its values in rental total
        double rentalTotal = costOfDays(rentalDays);
        // takes static method cost of options with the values of the days with options and puts it into options total
        double optionsTotal = costOfOptions(rentalDays, tollTag, GPS, roadside);
        // takes static method cost of surcharge with the age and days values and puts them into surcharge total
        double surchargeTotal = costOfSurcharge(rentalDays, age);
        // takes the new variables from static methods and combines them into total cost
        double totalCost = rentalTotal + optionsTotal + surchargeTotal;

        // -------------------------------------------------------------------------------------------

        // displays the date
        System.out.println("Your date of pickup: " + pickup);
        // displays the total price for number of days
        System.out.printf("Price for " + rentalDays + " day(s): $%.2f\n", rentalTotal);
        // displays the total price of addons
        System.out.printf("Price for addons: $%.2f\n", optionsTotal);
        // displays the total price of surcharge is driver is under 25
        System.out.printf("Driver surcharge: $%.2f\n", surchargeTotal);
        // displays the total cost of all combined
        System.out.printf("Total cost: $%.2f\n", totalCost);

        System.out.println("----------------------------------------------------------------");

    }

    // calculating the cost of with how many days user requests
    public static double costOfDays(double rentalDays) {
        if (rentalDays > 0) {
            rentalDays *= 29.99; // 29.99 for one day
        } else {
            System.out.println("Invalid number of days!");
            return 0;
        }
        return rentalDays;
    }

    // calculating the optional charges of Toll Tag, GPS, and Roadside with the total days
    public static double costOfOptions(int rentalDays, String tollTag, String GPS, String roadside) {
        double totalCost = 0;

        if (tollTag.equalsIgnoreCase("y")) {
            totalCost += 3.95 * rentalDays;
        }
        if (GPS.equalsIgnoreCase("y")) {
            totalCost += 2.95 * rentalDays;
        }
        if (roadside.equalsIgnoreCase("y")) {
            totalCost += 3.95 * rentalDays;
        }
        return totalCost;
    }

    // calculating age surcharge if age is younger than 25
    public static double costOfSurcharge(int rentalDays, int age) {

        if (age < 25){
            return (29.99 * rentalDays) * 0.30; // surcharge only if driver is younger than 25
        } else {
            return 0; // no surcharge for 25 or older
        }
    }

}
