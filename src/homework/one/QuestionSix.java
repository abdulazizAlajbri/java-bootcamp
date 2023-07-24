package homework.one;

import java.util.Scanner;

public class QuestionSix {
    private QuestionSix() {

    }

    // Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
    public static void answer() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Please enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Please enter the third number: ");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

        boolean result = (sum == thirdNumber);

        System.out.println(result);


    }


}
