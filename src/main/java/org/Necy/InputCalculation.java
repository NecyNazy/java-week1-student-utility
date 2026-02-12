package org.Necy;

public class InputCalculation {
    public static int add(int a, int b) {
        return a + b;
    }
    public static String evenOrOdd(int a) {
        if (a % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }
    public static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    public static String displayDayOfWeek(int day) {
        return switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
    }

}
