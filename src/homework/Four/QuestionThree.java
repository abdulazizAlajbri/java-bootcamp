package homework.Four;

import java.util.Arrays;

public class QuestionThree {

    private QuestionThree() {

    }

    public static void answer() {
        System.out.println("# program to find the numbers greater than the average of the numbers of a given array.");
        int array[] = {1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        int average = sum / array.length;
        int[] largest = new int[7];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > average) {
                largest[index] = array[index];
            }
        }
        System.out.println("The average is : " + average);
        System.out.println("The largest array is : " + Arrays.toString(largest));
    }
}
