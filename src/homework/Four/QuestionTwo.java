package homework.Four;

import java.util.Scanner;
import java.util.Arrays;

public class QuestionTwo {

    private QuestionTwo() {

    }

    public static void answer() {
        System.out.println("# Java program to find the k largest elements in a given array.");

        int[] array = {17, 7, 25, 3, 100};
        Scanner input = new Scanner(System.in);
        int temp = 0;
        for (int index = 0; index < array.length; index++) {
            for (int j = index + 1; j < array.length; j++) {
                if (array[j] > array[index]) {
                    temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Please Enter value of K : ");
        int k = input.nextInt();
        switch (k) {
            case 1:
                System.out.println(array[0]);
                break;
            case 2:
                System.out.println(array[0]);
                System.out.println(array[1]);
                break;
            case 3:
                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);
                break;
            case 4:
                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);
                System.out.println(array[3]);
                break;
            case 5:
                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);
                System.out.println(array[3]);
                System.out.println(array[4]);
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
