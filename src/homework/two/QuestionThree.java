package homework.two;

import java.util.Scanner;

public class QuestionThree {
    private QuestionThree() {
    }

    // Write a Java program that takes a string and a number from the user,then prints the character in the given index.
    public static void answer() {
        System.out.println("########## Question Three ##########");
        System.out.println("Print the character in the given index");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String userInput = input.nextLine();
        System.out.print("Please enter the index: ");
        int index = input.nextInt();
        if (index >= userInput.length()) {
            System.out.println("the index is out of bounds");
        } else {
            System.out.println(userInput.charAt(index));
        }
    }
}
