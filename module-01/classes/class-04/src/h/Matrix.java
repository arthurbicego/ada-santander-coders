package h;

import java.util.Scanner;

public class Matrix {
    static Scanner scanner = new Scanner(System.in);

    static String[][] board = {
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"_", "_", "_"}
    };

    public static void main(String[] args) {
        boolean keep = true;

        while (keep) {
            turn(1);
            keep = showResult();
            if (keep) {
                turn(2);
                keep = showResult();
            }
        }
    }

    public static Boolean showResult() {
        Integer winner = verifyResult();
        if (winner != null) {
            if (winner.equals(1)) {
                System.out.println("Player 1 is the winner!");
            } else if (winner.equals(2)) {
                System.out.println("Player 2 is the winner!");
            } else if (winner.equals(0)) {
                System.out.println("Draw!");
            }
            return false;
        }
        return true;
    }

    public static void turn(int player) {
        boolean choice = true;

        do {
            System.out.println("Player " + player + " turn.");
            System.out.println("Choose a Column between 1 and 3.");
            int column = scanner.nextInt();
            System.out.println("Choose a Line between 1 and 3.");
            int line = scanner.nextInt();
            if (board[line - 1][column - 1].equals("_")) {
                board[line - 1][column - 1] = (player == 1) ? "X" : "O";
                choice = false;
                printBoard(board);
            } else {
                printBoard(board);
                System.out.println("Space already used.");
            }
        } while (choice);
    }

    public static void printBoard(String[][] board) {
        System.out.println("\n");
        for (String[] line : board) {
            for (String column : line) {
                System.out.print(column + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }

    public static Integer verifyResult() {

        if (!board[0][0].equals("_") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return board[0][0].equals("X") ? 1 : 2;
        }

        if (!board[2][0].equals("_") && board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2])) {
            return board[2][0].equals("X") ? 1 : 2;
        }

        for (int i = 0; i < board.length; i++) {
            if (!board[i][0].equals("_") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return board[i][0].equals("X") ? 1 : 2;
            }
            for (int j = 0; j < board[i].length; j++) {
                if (!board[0][j].equals("_") && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
                    return board[0][j].equals("X") ? 1 : 2;
                }
            }
        }

        if (boardIsFull()) {
            return 0;
        }
        return null;
    }

    public static boolean boardIsFull() {
        boolean boardIsFull = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals("_")) {
                    boardIsFull = false;
                }
            }
        }

        return boardIsFull;
    }

}
