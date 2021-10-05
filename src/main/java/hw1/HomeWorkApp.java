package hw1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static char symbolX = 'X';
    public static char symbol0 = '0';
    public static char symbolEmpty = '_';
    public static final int SIZE = 5;
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            turnPlayer();
            if (checkWin(symbolX)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            turnComp();
            if (checkWin(symbol0)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[j][i] = symbolEmpty;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void turnPlayer() {
        int x, y;
        do {
            System.out.println("Введите координаты X");
            x = sc.nextInt();
            System.out.println("Введите координаты Y");
            y = sc.nextInt();
        } while (!isValidCoord(x, y));
        map[x - 1][y - 1] = symbolX;
        printMap();
    }

    public static void turnComp() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isValidCoord(x, y));
        map[x - 1][y - 1] = symbol0;
        printMap();
    }

    public static boolean isValidCoord(int x, int y) {
        if (x > 0 && x <= SIZE && y > 0 && y <= SIZE && map[x - 1][y - 1] == symbolEmpty) {
            return true;
        } else {
            System.out.println("Неверные координаты!");
            return false;
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbolEmpty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char symb) {
        int countSymbolsColumn = 0;
        int countSymbolsRow = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == symb){
                    countSymbolsColumn += 1;
                }
                if(map[j][i] == symb){
                    countSymbolsRow += 1;
                }
            }
            if (countSymbolsColumn == SIZE || countSymbolsRow == SIZE) {
                return true;
            } else {
                countSymbolsColumn = 0;
                countSymbolsRow = 0;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j  && map[i][j] == symb) {
                    countSymbolsColumn += 1;
                }
                if (j == SIZE - i - 1 && map[j][i] == symb) {
                    countSymbolsRow += 1;
                }
            }
        }
        if (countSymbolsColumn == SIZE || countSymbolsRow == SIZE) {
            return true;
        } else {
            countSymbolsColumn = 0;
            countSymbolsRow = 0;
        }
        return false;
    }
}



