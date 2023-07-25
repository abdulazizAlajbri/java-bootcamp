package homework.three;

import java.util.Scanner;

public class QuestionSix {

    private QuestionSix() {

    }

    public static void answer() {
        System.out.println("## Prints the sum of the even and odd integers ##");
        Scanner input = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter the Number : ");
        int number = input.nextInt();
        while (number != 0) {
            if (number % 2 == 0)
                evenSum += number;
            else
                oddSum += number;
        }
        System.out.println("The sum of even numbers is : " + evenSum);
        System.out.println("The sum of odd numbers is : " + oddSum);
    }

}
