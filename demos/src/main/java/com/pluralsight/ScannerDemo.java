package com.pluralsight;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        // creates the scanner
        Scanner myScanner = new Scanner(System.in);

        // asks the user a question
        System.out.print("Enter your name: ");

        // waiting for user's input
        String name = myScanner.nextLine();

        // prints out user's input
        System.out.println("Howdy " + name);

        // aks the user another question
        System.out.print("How old are you? ");
        int age = myScanner.nextInt();

        // eats the leftover carriage return from the nextInt scanner so it doesn't
        // get treated as the next user input
        myScanner.nextLine();

        System.out.println("You look great for " + age);

        // asks the user another question
        System.out.println("Whats your favorite color? ");

        // this won't be discarded since the leftover was eaten
        String color = myScanner.nextLine();

        System.out.println(color + " is a cool color!");

    }
}
