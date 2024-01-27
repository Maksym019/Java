import java.util.Scanner;

public class KrestikiNoliki {
    private static String[][] Pole = new String[3][3]; //The main TikTakToe board/
    private static boolean isGameFinish = false; //variable that determines whether the game is over.
    private static boolean Choise = (((int)(Math.random() * 2)) == 1);

    public static void main(String[] args) { //The main method that calls all other methods in order
        for (byte i = 0; i < Pole.length; i++) {
            for (byte j = 0; j < Pole[i].length; j++) {
                Pole[i][j] = " ";
            }
        }

        while (!isGameFinish) { //The main loop, which calls the necessary methods in
            if (Choise) {       //order depending on who is walking.
                System.out.println("Now is your step");
                printBoard();
                makeOnePlayerStep();
                isWinPosition();
                hasSpaseInBoard();
                printBoard();
                Choise = false;
            } else if (!Choise) {
                System.out.println("Now computer make one step");
                AI.makeOneComputerStep(Pole);
                isWinPosition();
                hasSpaseInBoard();
                printBoard();
                Choise = true;
            }
        }
    }

    private static void makeOnePlayerStep() {
        Scanner console = new Scanner(System.in);
        boolean isMove = false;
        System.out.println("Please, print two numbers form 0 to 2");
        byte x, y;
        while (!isMove) {
            x = console.nextByte();
            y = console.nextByte();
            if ((x > 2 || x < 0) || (y > 2 || y < 0)) {
                System.out.println("you can print just value from 0 to 2, try again");
                continue;
            }
            if (Pole[x][y].equals(" ")) {
                Pole[x][y] = "O";
                isMove = true;
            } else {
                System.out.println("This cell is closed, please write another one");
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (String[] a: Pole) {
            System.out.print("| ");
            for (String b: a) {
                System.out.print(b + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void isWinPosition() {
        if (Pole[0][0].equals("O") && (Pole[0][1].equals("O") && Pole[0][2].equals("O"))) {
            System.out.println("You win!");
            isGameFinish = true;
        } else if (Pole[1][0].equals("O") && (Pole[1][1].equals("O") && Pole[1][2].equals("O"))) {
            System.out.println("You win!");
            isGameFinish = true;
        } else if (Pole[2][0].equals("O") && (Pole[2][1].equals("O") && Pole[2][2].equals("O"))) {
            System.out.println("You win!");
            isGameFinish = true;
        } else if (Pole[0][0].equals("O") && (Pole[1][0].equals("O") && Pole[2][0].equals("O"))) {
            System.out.println("You win!");
            isGameFinish = true;
        } else if (Pole[0][1].equals("O") && (Pole[1][1].equals("O") && Pole[2][1].equals("O"))) {
            System.out.println("You win!");
            isGameFinish = true;
        } else if (Pole[0][2].equals("O") && (Pole[1][2].equals("O") && Pole[2][2].equals("O"))) {
            System.out.println("You win!");
            isGameFinish = true;
        } else if (Pole[0][0].equals("O") && (Pole[1][1].equals("O") && Pole[2][2].equals("O"))) {
            System.out.println("You win!");
            isGameFinish = true;
        } else if (Pole[0][2].equals("O") && (Pole[1][1].equals("O") && Pole[2][0].equals("O"))) {
            System.out.println("You win!");
            isGameFinish = true;
        } else if (Pole[0][0].equals("X") && (Pole[0][1].equals("X") && Pole[0][2].equals("X"))) {
            System.out.println("Computer win!");
            isGameFinish = true;
        } else if (Pole[1][0].equals("X") && (Pole[1][1].equals("X") && Pole[1][2].equals("X"))) {
            System.out.println("Computer win!");
            isGameFinish = true;
        } else if (Pole[2][0].equals("X") && (Pole[2][1].equals("X") && Pole[2][2].equals("X"))) {
            System.out.println("Computer win!");
            isGameFinish = true;
        } else if (Pole[0][0].equals("X") && (Pole[1][0].equals("X") && Pole[2][0].equals("X"))) {
            System.out.println("Computer win!");
            isGameFinish = true;
        } else if (Pole[0][1].equals("X") && (Pole[1][1].equals("X") && Pole[2][1].equals("X"))) {
            System.out.println("Computer win!");
            isGameFinish = true;
        } else if (Pole[0][2].equals("X") && (Pole[1][2].equals("X") && Pole[2][2].equals("X"))) {
            System.out.println("Computer win!");
            isGameFinish = true;
        } else if (Pole[0][0].equals("X") && (Pole[1][1].equals("X") && Pole[2][2].equals("X"))) {
            System.out.println("Computer win!");
            isGameFinish = true;
        } else if (Pole[0][2].equals("X") && (Pole[1][1].equals("X") && Pole[2][0].equals("X"))) {
            System.out.println("Computer win!");
            isGameFinish = true;
        }
    }

    private static void hasSpaseInBoard() {
        byte Point = 0;
        loop1: for (byte i = 0; i < Pole.length; i++) {
            for (byte j = 0; j < Pole[i].length; j++) {
                if (Pole[i][j].equals(" ")) {
                    Point++;
                }
            }
        }
        if (Point == 0) {
            System.out.println("There is no free space in board, nobody win!");
            isGameFinish = true;
        }
    }
}