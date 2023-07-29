package projectone;


import java.util.Scanner;

import static java.lang.System.exit;

public class project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char box[][] = {{' ', '|', ' ', '|', ' '}, {'-', '-', '-', '-', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '-', '-', '-', '-'}, {' ', '|', ' ', '|', ' '},};
        printBox(box);
        while (true) {
            userReturn(box);
            printBox(box);
            if (finishGame(box)) {
                break;
            }
            computerReturn(box);
            if (finishGame(box)) {
                break;
            }
            printBox(box);
            finishGame(box);
        }

    }

    public static void printBox(char box[][]) {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                System.out.print(box[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean finishGame(char box[][]) {
        if (won(box, 'X')) {
            System.out.println(" Player wins ");
            return true;
        }
        if (won(box, 'O')) {
            System.out.println(" Computer wins ");
            return true;
        }

        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                if (box[i][j] == ' ') {
                    return false;
                }

            }
        }

        System.out.println(" The game is a draw ");
        return true;
    }

    public static boolean won(char box[][], char symbol) {
        if (box[0][0] == symbol && box[0][2] == symbol && box[0][4] == symbol ||
                box[2][0] == symbol && box[2][2] == symbol && box[2][4] == symbol
                || box[4][0] == symbol && box[4][2] == symbol && box[4][4] == symbol ||
                box[0][0] == symbol && box[2][2] == symbol && box[4][4] == symbol ||
                box[4][0] == symbol && box[2][2] == symbol && box[0][4] == symbol ||
                box[0][0] == symbol && box[2][0] == symbol && box[4][0] == symbol ||
                box[0][2] == symbol && box[2][2] == symbol && box[4][2] == symbol ||
                box[0][4] == symbol && box[2][4] == symbol && box[4][4] == symbol) {
            return true;
        }
        return false;
    }

    public static void computerReturn(char box[][]) {
        Scanner input = new Scanner(System.in);
        int ComputerMove;
        while (true) {
            ComputerMove = (int) Math.round(1 + Math.random() * 8);
            System.out.println("Computer move is : " + ComputerMove);
            if (check(box, ComputerMove)) {
                break;
            }

        }
        userMoves(box, Integer.toString(ComputerMove), 'O');
    }

    public static void userReturn(char box[][]) {
        Scanner input = new Scanner(System.in);
        int move;
        while (true) {
            System.out.print(" Where would you like to play? : ");
            move = input.nextInt();
            if (check(box, move)) {
                break;
            }

        }
        userMoves(box, Integer.toString(move), 'X');
    }


    public static boolean check(char box[][], int move) {
        switch (move) {
            case 1:
                if (box[0][0] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            case 2:
                if (box[0][2] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            case 3:
                if (box[0][4] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            case 4:
                if (box[2][0] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            case 5:
                if (box[2][2] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            case 6:
                if (box[2][4] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            case 7:
                if (box[4][0] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            case 8:
                if (box[4][2] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            case 9:
                if (box[4][4] == ' ') {
                    return true;
                } else {
                    System.out.println("invalid move");
                    return false;
                }
            default:
                return false;
        }

    }


    public static void userMoves(char box[][], String position, char symbol) {
        switch (position) {
            case "1":
                box[0][0] = symbol;
                break;
            case "2":
                box[0][2] = symbol;
                break;
            case "3":
                box[0][4] = symbol;
                break;
            case "4":
                box[2][0] = symbol;
                break;
            case "5":
                box[2][2] = symbol;
                break;
            case "6":
                box[2][4] = symbol;
                break;
            case "7":
                box[4][0] = symbol;
                break;
            case "8":
                box[4][2] = symbol;
                break;
            case "9":
                box[4][4] = symbol;
                break;
            default:
                System.out.println("Invalid number please try again");
                break;
        }
    }

    public static void computerMoves(char box[][], String position, char symbol) {
        switch (position) {
            case "1":
                box[0][0] = symbol;
                break;
            case "2":
                box[0][2] = symbol;
                break;
            case "3":
                box[0][4] = symbol;
                break;
            case "4":
                box[2][0] = symbol;
                break;
            case "5":
                box[2][2] = symbol;
                break;
            case "6":
                box[2][4] = symbol;
                break;
            case "7":
                box[4][0] = symbol;
                break;
            case "8":
                box[4][2] = symbol;
                break;
            case "9":
                box[4][4] = symbol;
                break;
            default:
                System.out.println("Invalid number please try again");
                break;
        }
    }
}

