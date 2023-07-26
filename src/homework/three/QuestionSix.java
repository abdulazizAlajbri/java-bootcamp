package homework.three;

import java.util.Scanner;

public class QuestionSix {

    private QuestionSix() {

    }

    public static void answer() {
        Scanner input = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Please enter the 20 number you want to find the sum of");
        for (int index = 0; index < 20; index++) {
            System.out.println("Enter the number you want");
            int number = input.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("The sum of the even numbers is " + evenSum);
        System.out.println("The sum of the odd numbers is " + oddSum);

    }

}
