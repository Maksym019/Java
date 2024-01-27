public class AI {
    public static void makeOneComputerStep(String[][] pole) { //The main method in this Class
        String myNum = "X";
        Computer: while (true) {
            if (isWinningPosition(pole)) {
                isWinningPosition(pole);
                break Computer;
            } else if (howMuchPoints(pole) == 0) {
                pole[(int)(Math.random() * 3)][(int)(Math.random() * 3)] = "X";
                break;
            } else if (howMuchPoints(pole) == 1) {
                int x, y;
                while(true) {
                    x = (int)(Math.random() * 3);
                    y = (int)(Math.random() * 3);
                    if (pole[x][y].equals(" ")) {
                        pole[x][y] = myNum;
                        break Computer;
                    }
                }
            } else if (howMuchPoints(pole) >= 2) {
                if (((pole[0][0].equals("O")) && (pole[0][1].equals("O"))) && (pole[0][2].equals(" "))) {//1
                    pole[0][2] = myNum;
                    break;
                } else if (((pole[0][0].equals("O")) && pole[0][2].equals("O")) && (pole[0][1].equals(" "))) {//2
                    pole[0][1] = myNum;
                    break;
                } else if (((pole[0][1].equals("O")) && pole[0][2].equals("O")) && (pole[0][0].equals(" "))) {//3
                    pole[0][0] = myNum;
                    break;
                } else if (((pole[1][0].equals("O")) && pole[1][1].equals("O")) && (pole[1][2].equals(" "))) {//4
                    pole[1][2] = myNum;
                    break;
                } else if (((pole[1][0].equals("O")) && pole[1][2].equals("O")) && (pole[1][1].equals(" "))) {//5
                    pole[1][1] = myNum;
                    break;
                } else if (((pole[1][1].equals("O")) && pole[1][2].equals("O")) && (pole[1][0].equals(" "))) {//6
                    pole[1][0] = myNum;
                    break;
                } else if (((pole[2][0].equals("O")) && pole[2][1].equals("O")) && (pole[2][2].equals(" "))) {//7
                    pole[2][2] = myNum;
                    break;
                } else if (((pole[2][0].equals("O")) && pole[2][2].equals("O")) && (pole[2][1].equals(" "))) {//8
                    pole[2][1] = myNum;
                    break;
                } else if (((pole[2][1].equals("O")) && pole[2][2].equals("O")) && (pole[2][0].equals(" "))) {//9
                    pole[2][0] = myNum;
                    break;
                } else if (((pole[0][0].equals("O")) && pole[1][0].equals("O")) && (pole[2][0].equals(" "))) {//10
                    pole[2][0] = myNum;
                    break;
                } else if (((pole[0][0].equals("O")) && pole[2][0].equals("O")) && (pole[1][0].equals(" "))) {//11
                    pole[1][0] = myNum;
                    break;
                } else if (((pole[1][0].equals("O")) && pole[2][0].equals("O")) && (pole[0][0].equals(" "))) {//12
                    pole[0][0] = myNum;
                    break;
                } else if (((pole[0][1].equals("O")) && pole[1][1].equals("O")) && (pole[2][1].equals(" "))) {//13
                    pole[2][1] = myNum;
                    break;
                } else if (((pole[0][1].equals("O")) && pole[2][1].equals("O")) && (pole[1][1].equals(" "))) {//14
                    pole[1][1] = myNum;
                    break;
                } else if (((pole[1][1].equals("O")) && pole[2][1].equals("O")) && (pole[0][1].equals(" "))) {//15
                    pole[0][1] = myNum;
                    break;
                } else if (((pole[0][2].equals("O")) && pole[1][2].equals("O")) && (pole[2][2].equals(" "))) {//16
                    pole[2][2] = myNum;
                    break;
                } else if (((pole[0][2].equals("O")) && pole[2][2].equals("O")) && (pole[1][2].equals(" "))) {//17
                    pole[1][2] = myNum;
                    break;
                } else if (((pole[1][2].equals("O")) && pole[2][2].equals("O")) && (pole[0][2].equals(" "))) {//18
                    pole[0][2] = myNum;
                    break;
                } else if (((pole[0][0].equals("O")) && pole[1][1].equals("O")) && (pole[2][2].equals(" "))) {//19
                    pole[2][2] = myNum;
                    break;
                } else if (((pole[0][0].equals("O")) && pole[2][2].equals("O")) && (pole[1][1].equals(" "))) {//20
                    pole[1][1] = myNum;
                    break;
                } else if (((pole[1][1].equals("O")) && pole[2][2].equals("O")) && (pole[0][0].equals(" "))) {//21
                    pole[0][0] = myNum;
                    break;
                } else if (((pole[0][2].equals("O")) && pole[1][1].equals("O")) && (pole[2][0].equals(" "))) {//22
                    pole[2][0] = myNum;
                    break;
                } else if (((pole[2][0].equals("O")) && pole[0][2].equals("O")) && (pole[1][1].equals(" "))) {//23
                    pole[1][1] = myNum;
                    break;
                } else if (((pole[2][0].equals("O")) && pole[1][1].equals("O")) && (pole[0][2].equals(" "))) {//24
                    pole[0][2] = myNum;
                    break;
                } else {
                    for (byte i = 0; i < pole.length; i++) {
                        for (byte j = 0; j < pole[i].length; j++) {
                            if (pole[i][j].equals(" ")) {
                                pole[i][j] = myNum;
                                break Computer;
                            }
                        }
                    }
                }
            }
        }
    }

    private static byte howMuchPoints(String[][] pole) {
        byte count = 0;
        for (byte i = 0; i < pole.length; i++) {
            for (byte j = 0; j < pole.length; j++) {
                if (pole[i][j].equals("O")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isWinningPosition(String[][] pole) {
        if (((pole[0][0].equals("X")) && (pole[0][1].equals("X"))) && (pole[0][2].equals(" "))) {//1
            pole[0][2] = "X";
            return true;
        } else if (((pole[0][0].equals("X")) && pole[0][2].equals("X")) && (pole[0][1].equals(" "))) {//2
            pole[0][1] = "X";
            return true;
        } else if (((pole[0][1].equals("O")) && pole[0][2].equals("O")) && (pole[0][0].equals(" "))) {//3
            pole[0][0] = "X";
            return true;
        } else if (((pole[1][0].equals("X")) && pole[1][1].equals("X")) && (pole[1][2].equals(" "))) {//4
            pole[1][2] = "X";
            return true;
        } else if (((pole[1][0].equals("X")) && pole[1][2].equals("X")) && (pole[1][1].equals(" "))) {//5
            pole[1][1] = "X";
            return true;
        } else if (((pole[1][1].equals("X")) && pole[1][2].equals("X")) && (pole[1][0].equals(" "))) {//6
            pole[1][0] = "X";
            return true;
        } else if (((pole[2][0].equals("X")) && pole[2][1].equals("X")) && (pole[2][2].equals(" "))) {//7
            pole[2][2] = "X";
            return true;
        } else if (((pole[2][0].equals("X")) && pole[2][2].equals("X")) && (pole[2][1].equals(" "))) {//8
            pole[2][1] = "X";
            return true;
        } else if (((pole[2][1].equals("X")) && pole[2][2].equals("X")) && (pole[2][0].equals(" "))) {//9
            pole[2][0] = "X";
            return true;
        } else if (((pole[0][0].equals("X")) && pole[1][0].equals("X")) && (pole[2][0].equals(" "))) {//10
            pole[2][0] = "X";
            return true;
        } else if (((pole[0][0].equals("X")) && pole[2][0].equals("X")) && (pole[1][0].equals(" "))) {//11
            pole[1][0] = "X";
            return true;
        } else if (((pole[1][0].equals("X")) && pole[2][0].equals("X")) && (pole[0][0].equals(" "))) {//12
            pole[0][0] = "X";
            return true;
        } else if (((pole[0][1].equals("X")) && pole[1][1].equals("X")) && (pole[2][1].equals(" "))) {//13
            pole[2][1] = "X";
            return true;
        } else if (((pole[0][1].equals("X")) && pole[2][1].equals("X")) && (pole[1][1].equals(" "))) {//14
            pole[1][1] = "X";
            return true;
        } else if (((pole[1][1].equals("X")) && pole[2][1].equals("X")) && (pole[0][1].equals(" "))) {//15
            pole[0][1] = "X";
            return true;
        } else if (((pole[0][2].equals("X")) && pole[1][2].equals("X")) && (pole[2][2].equals(" "))) {//16
            pole[2][2] = "X";
            return true;
        } else if (((pole[0][2].equals("X")) && pole[2][2].equals("X")) && (pole[1][2].equals(" "))) {//17
            pole[1][2] = "X";
            return true;
        } else if (((pole[1][2].equals("X")) && pole[2][2].equals("X")) && (pole[0][2].equals(" "))) {//18
            pole[0][2] = "X";
            return true;
        } else if (((pole[0][0].equals("X")) && pole[1][1].equals("X")) && (pole[2][2].equals(" "))) {//19
            pole[2][2] = "X";
            return true;
        } else if (((pole[0][0].equals("X")) && pole[2][2].equals("X")) && (pole[1][1].equals(" "))) {//20
            pole[1][1] = "X";
            return true;
        } else if (((pole[1][1].equals("X")) && pole[2][2].equals("X")) && (pole[0][0].equals(" "))) {//21
            pole[0][0] = "X";
            return true;
        } else if (((pole[0][2].equals("X")) && pole[1][1].equals("X")) && (pole[2][0].equals(" "))) {//22
            pole[2][0] = "X";
            return true;
        } else if (((pole[2][0].equals("X")) && pole[0][2].equals("X")) && (pole[1][1].equals(" "))) {//23
            pole[1][1] = "X";
            return true;
        } else if (((pole[2][0].equals("X")) && pole[1][1].equals("X")) && (pole[0][2].equals(" "))) {//24
            pole[0][2] = "X";
            return true;
        }
        return false;
    }
}