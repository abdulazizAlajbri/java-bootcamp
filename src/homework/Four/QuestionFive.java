package homework.Four;

import java.util.Arrays;

public class QuestionFive {
    private QuestionFive() {

    }

    public static void answer() {
        System.out.println("# program to swap the first and last elements of an array and create a new array.");
        int[] array = {1, 2, 3, 5, 2};
        for (int index = 0; index < array.length; index++) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
