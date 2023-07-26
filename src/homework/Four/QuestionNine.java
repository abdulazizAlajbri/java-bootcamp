package homework.Four;

import java.util.ArrayList;

public class QuestionNine {
    private QuestionNine() {

    }

    public static void answer() {
        System.out.println("# program that places the odd elements of an array before the even elements.");
        int[] array = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        ArrayList<Integer> evenNumber = new ArrayList<Integer>();
        ArrayList<Integer> oddNumber = new ArrayList<Integer>();
        ArrayList<Integer> finalResult = new ArrayList<Integer>();
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0)
                evenNumber.add(array[index]);
            else
                oddNumber.add(array[index]);
        }
        for (int index = 0; index < oddNumber.size(); index++) {
            finalResult.add(oddNumber.get(index));
        }
        for (int index = 0; index < evenNumber.size(); index++) {
            finalResult.add(evenNumber.get(index));
        }
        System.out.println(finalResult);

    }

}
