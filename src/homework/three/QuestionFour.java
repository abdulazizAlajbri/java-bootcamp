package homework.three;

import java.util.Scanner;

public class QuestionFour {
    private QuestionFour() {

    }

    public static void answer() {
        System.out.println("####  Program to Find the Factorial Value of Any Number  ####");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int factorial = 1;
        for (int index = number; index > 1; index--) {
            factorial *= index;
        }
        System.out.println("Factorial value of is : " + factorial);
    }
}
