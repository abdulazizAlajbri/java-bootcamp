package homework.one;

import java.util.Scanner;

public class QuestionFive {

    private QuestionFive() {
    }

    // Write a program that checks the role of the user

    public static void answer() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your role: ");
        String role = input.nextLine();

        if (role.contains("admin"))
            System.out.print("Welcome admin");
        else if (role.contains("supervisor"))
            System.out.print("welcome supervisor");
        else if (role.contains("user"))
            System.out.print("Welcome user");
        else
            System.out.print("invalid role");
    }
}
