package homework.one;

import java.util.Scanner;

public class QuestionFour {
    private QuestionFour() {
    }

    // Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)
    public static void answer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
