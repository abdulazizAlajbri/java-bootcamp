package homework.one;

import java.util.Scanner;

public class QuestionOne {
    private QuestionOne() {
    }


    // Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.

    public static void answer() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Please enter the second number: ");
        double secondNumber = input.nextDouble();

        System.out.printf("The sum of %.2f and %.2f is ", firstNumber, secondNumber);
        System.out.println(firstNumber + secondNumber);

        System.out.printf("The subtraction of %.2f from %.2f is ", firstNumber, secondNumber);
        System.out.println(firstNumber - secondNumber);

        System.out.printf("The multiplication of %.2f by %.2f is ", firstNumber, secondNumber);
        System.out.println(firstNumber * secondNumber);

        if (secondNumber == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.printf("The division of %.2f by %.2f is ", firstNumber, secondNumber);
            System.out.println(firstNumber / secondNumber);

            System.out.printf("The modulus of divide %.2f by %.2f is ", firstNumber, secondNumber);
            System.out.println(firstNumber % secondNumber);
        }


    }

}
