package homework.Four;

import java.util.Scanner;

public class QuestionEight {
    private QuestionEight() {

    }

    public static void answer() {
        System.out.println("# program thats displays the number of occurrences of an element in the array.");

        int[] array = {1, 1, 1, 3, 5};
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to be searched : ");
        int number = input.nextInt();
        for (int index = 0; index < array.length; index++) {
            if (array[index] == number) {
                count++;
            }
        }
        System.out.println(number + " occurs " + count + " times");
    }
}
