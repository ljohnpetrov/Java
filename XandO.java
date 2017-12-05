/**
 * Java. Level 1. Lesson 4. Homework
 *
 * @author Ivan Petrov
 * @version dated Dec 05, 2017
 * @link https://github.com/ljohnpetrov/Java.git
 */

import java.util.*;
public class TicTacToe {
    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe();
    }

    TicTacToe() {
        initmap();
        while (true) {
            humanTurn();
            printmap();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!)");
                break;
            }
            if (isMapFull()) {
                System.out.println("SORRY, DRAW!)");
                break;
            }
            aiTurn();
            printmap();
            if (checkWin(DOT_O)) {
                System.out.println("YOU WON!)");
                break;
            }
            if (isMapFull()) {
                System.out.println("SORRY, DRAW!)");
                break;
            }
        }
        System.out.println("GAME OVER!)");
    }

    void initmap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
        }
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter x and y [1..3]");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    void printmap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

       boolean checkWin(char dot) {
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < SIZE; i++) {
            int sum = 0;
            int sum1 = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    sum++;
                }
                if (map[j][i] == dot) {
                    sum1++;
                }
                if (i == j) {
                    if (map[i][j] == dot)
                        d1++;
                }
                if (i + j == SIZE - 1) {
                    if (map[i][j] == dot)
                        d2++;
                }
            }
            if (sum1 == SIZE || sum == SIZE)
                return true;
        }
        if (d1 == SIZE || d2 == SIZE) {
            return true;
        }
           return false;
}

    boolean isMapFull(){
        for(int i = 0;i < SIZE; i++)
            for(int j = 0;j < SIZE; j++)
                if (map [i][j] == DOT_EMPTY)
                    return false;
        return true;
    }
    boolean isCellValid(int x, int y){
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        if (map[y][x] == DOT_EMPTY)
            return true;
        return false;
    }
}