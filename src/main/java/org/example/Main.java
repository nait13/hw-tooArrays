package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int userNum = scan.nextInt();
        scan.close();
        int[][] arr = createArr(userNum);
        findSumAllNumInArr(arr);

    }

    //    Task 1.1 and 1.2
    static int[][] createArr(int num) {
        Random random = new Random();
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(-100, 100);
                arr[i][j] += num;
            }
        }
        System.out.println("ARR " + Arrays.deepToString(arr));
        return arr;
    }

    //    Task 1.3
    static int findSumAllNumInArr(int[][] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                counter += arr[i][j];
            }
        }
        System.out.println("counter " + counter);
        return counter;
    }
}