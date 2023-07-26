package homework.Four;

import java.util.ArrayList;

public class QuestionSix {
    private QuestionSix() {

    }

    public static void answer() {
        System.out.println("# program to find all of the longest word in a given dictionary.");
        String[] dictionary = {"abdulaziz", "abdullahh", "aii", "asma"};
        int longesrWord = 0;
        ArrayList<String> NewList = new ArrayList<String>();
        for (int index = 0; index < dictionary.length; index++) {
            if (dictionary[index].length() > longesrWord) {
                longesrWord = dictionary[index].length();
            }
        }
        for (int index = 0; index < dictionary.length; index++) {
            if (dictionary[index].length() == longesrWord) {
                NewList.add(dictionary[index]);
            }
        }
        System.out.println(NewList);
    }
}
