package homework.two;

import java.util.Scanner;

public class QuestionTwo {

    private QuestionTwo() {
    }


    // Write a Java program to convert a given string into lowercase.

    public static void answer() {
        System.out.println("########## Question Two ##########");
        System.out.println("Convert a given string into lowercase");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String userInput = input.nextLine();
        System.out.println(userInput.toLowerCase());
    }


}
