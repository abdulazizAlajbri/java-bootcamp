package homework.three;

import java.util.Scanner;

public class QuestionTen {

    private QuestionTen() {

    }

    public static void answer() {
        System.out.println("## Program That check if the word is a palindrome or not ##");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String newWord = "";
        for (int index = word.length() - 1; index >= 0; index--) {
            newWord += word.charAt(index);
        }
        if (word.equals(newWord)) {
            System.out.println("The Word is a palindrome");
        } else {
            System.out.println("The word is not palindrome");
        }


    }
}
