package com.pluralsight;

public class MathApp {

    // this is the main method and where the code will run from
    // all code for this exercise will be in this method
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        // 1. finding out which salary is greatest
        int bobSalary = 55000;
        int garySalary = 100000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        System.out.println("---------------------------------------");

        // 2. finding out which price is the lowest
        int carPrice = 28000;
        int truckPrice = 45000;

        System.out.println("The lowest price is " + Math.min(carPrice, truckPrice));

        System.out.println("---------------------------------------");

        // 3. finding the area of a circle whose radius is 7.25
        double radius = 7.25;

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is " + area);

        System.out.println("---------------------------------------");

        // 4. finding the square root of 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root is " + squareRoot);

        System.out.println("---------------------------------------");

        // 5. finding the distance between points (5, 10) and (85, 50)
        double x1 = 5.0, y1 = 10.0, x2 = 85.0, y2 = 50.0;

        // formula of distance between two points is
        // finding the square root of x2 - x1 to the power of 2 plus y2 - y1 to the power of 2
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the two points is " + distance);

        System.out.println("---------------------------------------");

        // 6. finding the absolute (positive) value of a variable after it is set to -3.8

        System.out.println(Math.abs(-3.8));

        System.out.println("---------------------------------------");

        // 7. finding a random number between 0 and 1

        System.out.println(Math.random());
        
        System.out.println("---------------------------------------");

    }

}
