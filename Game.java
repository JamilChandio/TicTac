package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    
    private String board[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    private Scanner input = new Scanner(System.in);
    private int count;

    private void printBoard() {

        System.out.println("\n P1[x]       P2[o] \n");

        for (int i = 0; i < 7; i = i + 3) {
            System.out.println("     |       |     ");
            System.out.println("  " + board[i] + "  |   " + board[i + 1] + "   |  " + board[i + 2] + "  ");
            if (i < 4)
                System.out.println("_____|_______|_____");
        }
    }

    private boolean horizontal() {
        for (int i = 0; i < 7; i = i + 3) {
            if (board[i] == board[i + 1] && board[i + 1] == board[i + 2])
                return true;
        }
        return false;
    }

    private boolean vertical() {
        for (int i = 0; i < 3; i++) {
            if (board[i] == board[i + 3] && board[i + 3] == board[i + 6])
                return true;
        }
        return false;
    }

    private boolean diagonal() {
        if (board[0] == board[4] && board[4] == board[8])
            return true;
        if (board[2] == board[4] && board[4] == board[6])
            return true;

        return false;
    }

    private boolean checkWinner() {
        return (vertical() || horizontal() || diagonal());
    }

    private String turn(int count) {
        return (count % 2 == 0) ? "o" : "x";
    }

    private boolean isAvailable(int a) {

        if (board[a - 1] == "x" || board[a - 1] == "o") {
            System.out.println("this block is already ticked!");
            return false;
        }

        return true;
    }

    public void start() {
        printBoard();
        count = 1;
        int in = 0;
        while (count < 10) {

            boolean isCorrectInput = false;

            while (!isCorrectInput) {
                System.out.print("\nPLAYER[" + turn(count) + "] :");
                try {
                    in = input.nextInt();
                    isCorrectInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("invalid input, enter in the range of 1-9");
                    input.nextLine();
                }
            }

            switch (in) {
                case 1:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                case 2:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                case 3:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                case 4:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                case 5:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                case 6:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                case 7:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                case 8:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                case 9:
                    if (!isAvailable(in))
                        continue;

                    board[in - 1] = turn(count);
                    printBoard();

                    if (checkWinner()) {
                        printBoard();
                        System.out.println(turn(count) + " has won the game");
                    }
                    break;

                default:
                    System.out.println("enter within range of 1-9");
                    continue;
            }

            if (checkWinner())
                break;

            if (checkWinner() == false && count == 9)
                System.out.println("It's a draw");

            count++;
        }
    }
}
