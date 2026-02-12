package org.Necy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);

        boolean running = true;

        while (running) {

            System.out.println(
                    "=========STUDENT UTILITY APP=========");
            System.out.println("1. Add two numbers");
            System.out.println("2. Check if a number is EVEN or ODD");
            System.out.println("3. Print numbers from 1 to N");
            System.out.println("4. Display day of the week");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int choice;
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid number! choose a number)");
                scanner.next();
                continue;
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userInput.addNumbers();
                    break;
                case 2:
                    userInput.evenOrOddNumber();
                    break;
                case 3:
                    userInput.printUptoN();
                    break;
                case 4:
                    userInput.displayDay();
                    break;
                case 5:
                    userInput.exit();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. choose a number between 1 and 5");
            }
        }
        scanner.close();

    }


}