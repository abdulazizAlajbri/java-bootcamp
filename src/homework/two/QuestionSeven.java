package homework.two;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuestionSeven {

    private QuestionSeven() {

    }

    // Take three numbers from the user and print the greatest number.

    public static void answer() {
        System.out.println("########## Question Seven ##########");
        System.out.println("Take three numbers from the user and print the greatest number");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Please enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Please enter the third number: ");
        int thirdNumber = input.nextInt();

        List<Integer> numbers = List.of(firstNumber, secondNumber, thirdNumber);

        int greatestNumber = Collections.max(numbers);

        System.out.println("The Greatest number is: " + greatestNumber);

    }
}
