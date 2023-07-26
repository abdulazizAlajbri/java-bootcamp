package homework.Four;

public class QuestionOne {
 private QuestionOne(){

 }
    public static void answer() {
        System.out.println("# program to test if the first and the last element of an array of integers are same.");
        int[] first = {1, 2, 3, 4};
        if (first.length == first.length - 1) {
            System.out.println("Ture");
        } else {
            System.out.println("False");
        }
    }
}
