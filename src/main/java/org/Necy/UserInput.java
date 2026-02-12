package org.Necy;

import java.util.Scanner;

import static org.Necy.InputCalculation.*;

public record UserInput(Scanner scanner) {

    public void addNumbers() {
        System.out.println("Enter two numbers.");
        System.out.println("Enter first number: " );
        int x = enterNumber();
        System.out.println("Enter second number: " );
        int y = enterNumber();
        int result = add(x, y);
        System.out.println(result);
    }

    public void evenOrOddNumber() {
        System.out.println("Enter a number:");
        int a = enterNumber();
        String result = evenOrOdd(a);
        System.out.println(result);
    }

    public void printUptoN() {
        System.out.println("Enter a number");
        int n = enterNumber();
        printN(n);
    }

    public void displayDay() {
        System.out.println("Please enter a number between 1 and 7");
        int n = enterNumber();
        String result = displayDayOfWeek(n);
        System.out.println(result);
    }

    public void exit() {
        System.out.println("Thank you for using the app");
    }

    //HELPER: This handles invalid cases to prevent the app from crashing when user enters invalid input
    private int enterNumber() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please input a number");
            scanner.next(); // this helps to clear invalid text so java doesn't get stuck while trying to reprocess the invalid input
        }
        return scanner.nextInt();
    }

}
