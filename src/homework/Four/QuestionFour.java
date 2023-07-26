package homework.Four;

import java.util.Arrays;

public class QuestionFour {
    private QuestionFour() {

    }

    public static void answer() {
        System.out.println("# program to get the larger value between first and last element of an array of integers.");
        int[] array = {20, 30, 40};
        int max = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        System.out.println("The largest value is : " + max);
    }
}
