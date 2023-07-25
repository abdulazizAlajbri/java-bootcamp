package homework.three;
import java.util.Scanner;
public class QuestionTwo {
    private QuestionTwo(){

    }
    public static void answer(){
        System.out.println("####  Program to Reverse a String ####");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = input.nextLine();
        for (int index = 0; index < word.length(); index++) {
            System.out.print(word.charAt(word.length() - index - 1));
        }
    }
}
