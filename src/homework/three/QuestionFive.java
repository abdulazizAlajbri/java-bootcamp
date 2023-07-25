package homework.three;

import java.util.Scanner;

public class QuestionFive {
    private QuestionFive() {

    }

    // not finish yet
    public static void answer() {
        System.out.println("#### Program to Find the Value of one Number Raised to the Power of another ####");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the FirstNumber : ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the SecondNumber : ");
        int secondNumber = input.nextInt();
        int result = 1;
        while (secondNumber != 0) {
            result *= firstNumber;
            --secondNumber;
        }
        System.out.println("The power of number is : " + result);
    }
}
