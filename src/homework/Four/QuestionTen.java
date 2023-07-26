package homework.Four;

import java.util.Arrays;

public class QuestionTen {
    private QuestionTen() {

    }

    public static void answer() {
        System.out.println("# program that test the equality of two arrays.");
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(array1, array2));
    }
}
