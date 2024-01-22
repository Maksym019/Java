import java.util.Scanner;

class KrestikiNoliki {
    private static boolean isGameFinish = false;
    public static void main(String[] args) {
        String[][] Array = new String[3][3];
        boolean Choise = (int) (Math.random() * 2) == 1;

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = " ";
            }
        }

        while (!isGameFinish) {
            if (Choise) {
                AI.makeOneComputerStep(Array);
                getTheWinner(Array);
                Choise = false;
            } else if (!Choise) {
                makeOnePlayerStep(Array);
                getTheWinner(Array);
                Choise = true;
            }
        }
    }

    private static void getTheWinner(String[][] array) {
        flag: for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((array[0][0].equals("0")) && (array[1][0].equals("0")) && (array[2][0].equals("0"))) {
                    System.out.println("You win the computer");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][1].equals("0")) && (array[1][1].equals("0")) && (array[2][1].equals("0"))) {
                    System.out.println("You win the computer");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][2].equals("0")) && (array[1][2].equals("0")) && (array[2][2].equals("0"))) {
                    System.out.println("You win the computer");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][0].equals("0")) && (array[0][1].equals("0")) && (array[0][2].equals("0"))) {
                    System.out.println("You win the computer");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[1][0].equals("0")) && (array[1][1].equals("0")) && (array[1][2].equals("0"))) {
                    System.out.println("You win the computer");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[2][0].equals("0")) && (array[2][1].equals("0")) && (array[2][2].equals("0"))) {
                    System.out.println("You win the computer");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][0].equals("0")) && (array[1][1].equals("0")) && (array[2][2].equals("0"))) {
                    System.out.println("You win the computer");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[2][0].equals("0")) && (array[1][1].equals("0")) && (array[0][2].equals("0"))) {
                    System.out.println("You win the computer");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][0].equals("X")) && (array[1][0].equals("X")) && (array[2][0].equals("X"))) {
                    System.out.println("Computer win you");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][1].equals("X")) && (array[1][1].equals("X")) && (array[2][1].equals("X"))) {
                    System.out.println("Computer win you");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][2].equals("X")) && (array[1][2].equals("X")) && (array[2][2].equals("X"))) {
                    System.out.println("Computer win you");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][0].equals("X")) && (array[0][1].equals("X")) && (array[0][2].equals("X"))) {
                    System.out.println("Computer win you");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[1][0].equals("X")) && (array[1][1].equals("X")) && (array[1][2].equals("X"))) {
                    System.out.println("Computer win you");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[2][0].equals("X")) && (array[2][1].equals("X")) && (array[2][2].equals("X"))) {
                    System.out.println("Computer win you");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[0][0].equals("X")) && (array[1][1].equals("X")) && (array[2][2].equals("X"))) {
                    System.out.println("Computer win you");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                } else if ((array[2][0].equals("X")) && (array[1][1].equals("X")) && (array[0][2].equals("X"))) {
                    System.out.println("Computer win you");
                    printBoard(array);
                    isGameFinish = true;
                    break flag;
                }
            }
        }
    }

    private static void makeOnePlayerStep(String[][] arrays){ //FIXME
        Scanner console = new Scanner(System.in);
        printBoard(arrays);
        System.out.println("Make your step");
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j].equals(" ")) {
                    System.out.println("Now free positions is: " + i + " " + j);
                }
            }
        }
        System.out.println("Write position where would you like to print 0 ");
        int firstNum = console.nextInt(), secondNum = console.nextInt();
        int count = 0;
        while (true) {
            if (arrays[firstNum][secondNum].equals(" ")) {
                arrays[firstNum][secondNum] = "0";
                count = 0;
                break;
            } else if ((arrays[firstNum][secondNum].equals("0") || (arrays[firstNum][secondNum].equals("X"))) && count < 1) {
                System.out.println("this place is not free, which another one");
                count++;
            }
        }
        printBoard(arrays);
    }

    public static void printBoard(String[][] board) {
        System.out.println("-------------");
        for (String[] a: board) {
            System.out.print("| ");
            for (String b: a) {
                System.out.print(b + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}