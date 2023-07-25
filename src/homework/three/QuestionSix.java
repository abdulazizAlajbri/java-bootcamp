package homework.three;

import java.util.Scanner;

public class QuestionSix {

    private QuestionSix() {

    }

    public static void answer() {
        Scanner input = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Please enter the Count of numbers you want to find the sum of");
        int count = input.nextInt();
        for (int index = 1; index <= count; index++) {
            System.out.println("Enter the number : ");
            int number = input.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("The sum of even numbers is : " + evenSum);
        System.out.println("The sum of odd numbers is : " + oddSum);

    }

}
