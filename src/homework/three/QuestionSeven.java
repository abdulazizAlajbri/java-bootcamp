package homework.three;

import java.util.Scanner;

public class QuestionSeven {
    private QuestionSeven() {

    }

    public static void answer() {
        System.out.println("# Program that prompts the user to input a positive integer and check if prime or not#");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive integer : ");
        int number = input.nextInt();
        for (int index = 1; index <= 1; index++) {
            if (number % 2 == 0) {
                System.out.println(" is not a prime number");
            } else if (number < 0)
                System.out.println("Please enter a positive integer");
            else {
                System.out.println(" is a prime number");
            }
        }
    }
}
