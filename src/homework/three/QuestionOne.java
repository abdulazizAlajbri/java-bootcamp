package homework.three;

public class QuestionOne {

    private QuestionOne() {
    }

    public static void answer() {
        System.out.println("### Print Number form 1 To 100 And Check ");
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            }

            System.out.println(number);
        }
    }
}

