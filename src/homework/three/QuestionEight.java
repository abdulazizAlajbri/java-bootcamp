package homework.three;

import java.util.Scanner;

public class QuestionEight {
    private QuestionEight() {

    }

    public static void answer() {
        System.out.println("# program to enter the numbers till the user wants \n" + "and at the end it should display the count of positive, negative and zeros entered. #");
        Scanner input = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        System.out.println("Enter the any Number : for end the program press 0 ");
        int number = input.nextInt();
        while (number != 0) {
            System.out.print("Enter the number : ");
            number = input.nextInt();
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else if (number == 0) {
                countZero++;
            }
        }
        System.out.println("The number of positive numbers is : " + countPositive);
        System.out.println("The number of negative numbers is : " + countNegative);
        System.out.println("The number of zeros is : " + countZero);
    }
}
