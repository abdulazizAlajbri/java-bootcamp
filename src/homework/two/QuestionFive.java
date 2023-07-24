package homework.two;

import java.util.Scanner;

public class QuestionFive {

    private QuestionFive() {
    }

    // Write a program that checks the role of the user

    public static void answer() {
        System.out.println("########## Question Five ##########");
        System.out.println("Checks the role of the user");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your role: ");
        String role = input.nextLine();

        if (role.contains("admin"))
            System.out.println("Welcome admin");
        else if (role.contains("supervisor"))
            System.out.println("welcome supervisor");
        else if (role.contains("user"))
            System.out.println("Welcome user");
        else
            System.out.println("invalid role");
    }
}
