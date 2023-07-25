package homework.three;

import java.util.Scanner;

public class QuestionThree {
    private QuestionThree() {

    }

    public static void answer() {
        System.out.println("####  Print the Multiplication Table of that number ####");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Positive integer : ");
        int number = input.nextInt();
        for (int index = 1; index <= 10; index++) {
            if (number < 0) {
                System.out.println("Please enter a positive integer");
                break;
            }
            System.out.println(number + " * " + index + " = " + number * index);
        }
    }
}
