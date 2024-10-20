package com.kodilla;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {5, 3, -2},
                {-7, 4, 8},
                {-2, 7, 1},
                {9, 5, 3}
        };
        MatrixSwitcher switcher = new MatrixSwitcher();
        int[][] result = switcher.switchColsToRows(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println();
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "|");
            }
        }
    }
}