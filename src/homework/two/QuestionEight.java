package homework.two;

import java.util.Scanner;

public class QuestionEight {
    private QuestionEight() {

    }

    // Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
    public static void answer() {
        System.out.println("########## Question Eight ##########");
        System.out.println("Displays the name of the weekday");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid input");
        }

    }
}
