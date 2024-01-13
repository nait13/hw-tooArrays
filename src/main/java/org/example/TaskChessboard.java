package org.example;

import java.util.Arrays;

public class TaskChessboard {
    //  Task 2
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = (j % 2 == 0) ? "W" : "B";
                } else {
                    arr[i][j] = (j % 2 == 0) ? "B" : "W";
                }
                System.out.print(" " + arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}
